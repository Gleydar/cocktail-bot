package edu.hm.cs.pblv.group3.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.hm.cs.pblv.group3.model.entities.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
	
	public List<Ingredient> findByName(String name);
	
	@Query(value = "SELECT DISTINCT name FROM INGREDIENT", nativeQuery = true)
	public List<String> findDistinctName();

}
