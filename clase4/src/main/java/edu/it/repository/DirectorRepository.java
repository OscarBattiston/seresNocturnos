package edu.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.it.entities.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, String> {

}
