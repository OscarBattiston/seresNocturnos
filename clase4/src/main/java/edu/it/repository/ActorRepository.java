package edu.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.it.entities.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, String> {

}
