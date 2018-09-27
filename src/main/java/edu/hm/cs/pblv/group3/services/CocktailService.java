package edu.hm.cs.pblv.group3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.cs.pblv.group3.entities.Cocktail;
import edu.hm.cs.pblv.group3.entities.Ingredient;
import edu.hm.cs.pblv.group3.repositories.CocktailRepository;
import edu.hm.cs.pblv.group3.repositories.IngredientRepository;

@Transactional
@Service
public class CocktailService {
	
	private CocktailRepository cockRepo;
	private IngredientRepository ingRepo;
	
	@Autowired
	public CocktailService(CocktailRepository cockRepo, IngredientRepository ingRepo) {
		this.cockRepo = cockRepo;
		this.ingRepo = ingRepo;
	}
	
	public List<CocktailResult> findTopCocktails(Set<String> ingredients, int top) {
		int numberOfIngredients = ingredients.size();
		List<Ingredient> ingList = new ArrayList<>();
		ingredients.stream().map(ingRepo::findByName).forEach(ingList::addAll);
		
		List<Cocktail> foundCocktails = ingList.stream().map(Ingredient::getCocktail).collect(Collectors.toList());
		
//		Collectors.coun

		
		Map<Cocktail, Long> cocktailsContainIngredients = foundCocktails.stream().distinct().collect(Collectors.groupingBy(cock -> cock, Collectors.counting()));
		
		List<CocktailResult> matches = foundCocktails.stream().distinct().map(cock -> new CocktailResult(cock, (double) numberOfIngredients / cocktailsContainIngredients.get(cock))).collect(Collectors.toList());
		
		return matches.subList(0, top);
	}
}