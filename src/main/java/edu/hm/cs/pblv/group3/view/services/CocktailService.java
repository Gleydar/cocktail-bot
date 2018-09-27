package edu.hm.cs.pblv.group3.view.services;

import edu.hm.cs.pblv.group3.model.entities.Cocktail;
import edu.hm.cs.pblv.group3.model.entities.CocktailResult;
import edu.hm.cs.pblv.group3.model.entities.Ingredient;
import edu.hm.cs.pblv.group3.repositories.CocktailRepository;
import edu.hm.cs.pblv.group3.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

	public List<CocktailResult> findTopCocktails(Set<Ingredient> ingredients, int top) {
		int numberOfIngredients = ingredients.size();
		List<Cocktail> foundCocktails = ingredients.stream().map(Ingredient::getCocktail).collect(Collectors.toList());
		Map<Cocktail, Long> cocktailsContainIngredients = foundCocktails.stream().distinct().collect(Collectors.groupingBy(cock -> cock, Collectors.counting()));
		List<CocktailResult> matches = foundCocktails.stream().distinct().map(cock -> new CocktailResult(cock, (double) numberOfIngredients / cocktailsContainIngredients.get(cock))).collect(Collectors.toList());

		return matches.subList(0, top);
	}
}