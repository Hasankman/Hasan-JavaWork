package com.qa.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.demo.persistence.domain.Person;
import com.qa.demo.persistence.domain.PersonDTO;
import com.qa.demo.persistence.exceptions.PersonNotFoundException;
import com.qa.demo.persistence.repo.PersonRepo;

@Service
public class PersonService {

    private PersonRepo repo;

    private ModelMapper mapper;

    public PersonService(PersonRepo repo, ModelMapper mapper) {
        super();
        this.repo = repo;
        this.mapper = mapper;
    }

    private PersonDTO mapToDTO(Person person) {
        return this.mapper.map(person, PersonDTO.class);
    }

    public PersonDTO addPerson(Person person) {
        Person saved =  this.repo.save(person);
        return this.mapToDTO(saved);
    }

    public List<PersonDTO> getAllPeople() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public PersonDTO updatePerson(Long id, Person newPerson) {
        Optional<Person> existingOptional = this.repo.findById(id);
        Person existing = existingOptional.get();

        existing.setAge(newPerson.getAge());
        existing.setName(newPerson.getName());

        Person updated =  this.repo.save(existing);
        return this.mapToDTO(updated);
    }

    public boolean removePerson(Long id) {
        this.repo.deleteById(id);
        boolean exists = this.repo.existsById(id);
        return !exists;
    }

}

/*
@Service
public class PersonService {

	private PersonRepo repo;

	public PersonService(PersonRepo repo) {
		super();
		this.repo = repo;
	}

	public Person create(Person person) {
		return this.repo.save(person);
	}

	public Person readOne(Long id) {
		return this.repo.findById(id).orElseThrow(PersonNotFoundException::new);
	}

	public List<Person> readAll() {
		return this.repo.findAll();
	}

	public Person update(Person person, Long id) {
		Person toUpdate = this.readOne(id);
		toUpdate.setName(person.getName());
		toUpdate.setAge(person.getAge());
		return this.repo.save(toUpdate);
	}

	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
*/