package com.example.accService;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	Optional<Account> findById(Long id);

	void deleteById(Long id);

	boolean existsById(Long id);

}

/* Entering new data to JSON
{
	"AcountNumber": "12345678",
	"name": "Jon Favreau",
}
*/