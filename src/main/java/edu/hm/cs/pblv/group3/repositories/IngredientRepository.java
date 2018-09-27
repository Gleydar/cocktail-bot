package edu.hm.cs.pblv.group3.repositories;

import edu.hm.cs.pblv.group3.model.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
	
	public List<Ingredient> findByName(String name);
	
	@Query(value = "SELECT DISTINCT name FROM ingredient", nativeQuery = true)
	public List<String> findDistinctName();

}
