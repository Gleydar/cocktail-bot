package edu.hm.cs.pblv.group3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hm.cs.pblv.group3.entities.Ingredient;
import edu.hm.cs.pblv.group3.entities.ZusammengesetzerPK;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, ZusammengesetzerPK> {

}
