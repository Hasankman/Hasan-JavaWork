package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer>{
	//Save
	//FindById
	//FindAll
	//existById
	// SELECT * from film where title = Iron Man
	@Query(value = "SELECT * from film where title = ?1", nativeQuery = true)
	List<Film> findFilmByTitle(String title);// abstract method, no-body
	
	// find all action movies released after 2002
	@Query(value = "SELECT * from film where genre = ?1 and release_year>?2 ", nativeQuery = true)
	List<Film>	findFilmByYear(String genre, int year);// abstract method, no-body
}

/* Entering new data to JSON
{
	"title": "Iron Man",
	"releaseYear": 2008,
	"director": "Jon Favreau",
	"boxOffice": 58580000,
	"genre": "Action",
	"platform": "Theater",
	"duration": 126,
	"language": "Engilish"
}
*/