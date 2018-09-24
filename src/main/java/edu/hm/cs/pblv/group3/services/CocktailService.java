package edu.hm.cs.pblv.group3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.cs.pblv.group3.repositories.CocktailRepository;

@Service
public class CocktailService {
	
	private CocktailRepository cockRepo;
	
	@Autowired
	public void setCockRepo(CocktailRepository cockRepo) {
		this.cockRepo = cockRepo;
	}
	
//	public List<Cocktail> findBy

}
