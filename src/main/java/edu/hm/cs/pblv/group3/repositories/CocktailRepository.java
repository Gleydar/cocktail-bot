package edu.hm.cs.pblv.group3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hm.cs.pblv.group3.entities.Cocktail;

@Repository
public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
	
//	public 

}
