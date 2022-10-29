package com.qa.demo.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.demo.exception.BandNotFoundException;
import com.qa.demo.persitence.domain.Band;
import com.qa.demo.persitence.repository.BandRepository;
import com.qa.demo.rest.dto.BandDTO;

import lombok.AllArgsConstructor;
import lombok.Data;



@Service
@AllArgsConstructor
@Data
public class BandService {

	private BandRepository repo;
	private ModelMapper mapper;
	
	private BandDTO mapToDTO(Band band) {
		return this.mapper.map(band, BandDTO.class);
	}
	
	public BandDTO addBand(Band band) {
		Band saved = this.repo.save(band);
		return this.mapToDTO(saved);
	}
	
	public List<BandDTO> getAllBands() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public BandDTO updateBand(Long id, Band band) {
		Optional<Band> tempBand = Optional.of(this.repo.findById(id).orElseThrow(BandNotFoundException::new));
		
		Band existing = tempBand.get();
		existing.setName(band.getName());
		existing.setMusicians(band.getMusicians());
		
		Band updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteBand(Long id) {
		this.repo.findById(id).orElseThrow(BandNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public BandDTO readById(Long id) {
        Band found = this.repo.findById(id).orElseThrow(BandNotFoundException::new);
        return this.mapToDTO(found);
    }
	
	public BandDTO readByName(String name) {
		Band found = this.repo.bandByName(name).orElseThrow(BandNotFoundException::new);
		return this.mapToDTO(found);
	}
	
}