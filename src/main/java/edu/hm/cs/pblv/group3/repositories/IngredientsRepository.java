package edu.hm.cs.pblv.group3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hm.cs.pblv.group3.entities.Ingredients;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {

}
