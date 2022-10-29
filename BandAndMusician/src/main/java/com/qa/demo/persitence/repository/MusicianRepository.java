package com.qa.demo.persitence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.demo.persitence.domain.Musician;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, Long> {
	
	@Query("select m from Musician m where m.name=?1")
	Optional<List<Musician>> musicianByName(String name);
	
	@Query(value = "SELECT * from Musician where name = ?1", nativeQuery = true)
	List<Musician> findMusicianByName(String name);// abstract method, no-body
	
	@Query(value = "SELECT * from band where string = ?1", nativeQuery = true)
	List<Musician> findMusicianByString(Integer strings);// abstract method, no-body
	
	@Query(value = "SELECT * from band where type = ?1", nativeQuery = true)
	List<Musician> findMusicianByType(String type);// abstract method, no-body
	
}
