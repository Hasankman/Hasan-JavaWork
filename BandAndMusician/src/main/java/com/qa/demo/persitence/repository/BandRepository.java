package com.qa.demo.persitence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.qa.demo.persitence.domain.Band;


@Repository
public interface BandRepository extends JpaRepository<Band, Long>{
		
	@Query("select b from Band b where b.name=?1")
	Optional<Band> bandByName(String name);
	
	@Query(value = "SELECT * from band where name = ?1", nativeQuery = true)
	List<Band> findBandByName(String name);// abstract method, no-body
	
	@Query(value = "SELECT * from band where musicians = ?1", nativeQuery = true)
	List<Band> findBandByMusicians(String musicians);// abstract method, no-body
}
