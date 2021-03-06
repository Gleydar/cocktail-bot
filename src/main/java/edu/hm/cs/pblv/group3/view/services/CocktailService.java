package edu.hm.cs.pblv.group3.view.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.cs.pblv.group3.model.entities.Cocktail;
import edu.hm.cs.pblv.group3.model.entities.CocktailResult;
import edu.hm.cs.pblv.group3.model.entities.Ingredient;
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

	public List<CocktailResult> findTopCocktails(String input, int top) {
		
		Set<String> ingredients = new HashSet<>(ingRepo.findDistinctName());
		ingredients.removeIf(ingredient -> !input.contains(ingredient));
		
		int numberOfIngredients = ingredients.size();
		List<Ingredient> ingList = new ArrayList<>();
		ingredients.stream().map(ingRepo::findByName).forEach(ingList::addAll);
		
		List<Cocktail> foundCocktails = ingList.stream().map(Ingredient::getCocktail).collect(Collectors.toList());
//		for(Entry<Cocktail, Long> e : cocktailsContainIngredients.entrySet()) {
//			if(e.getKey().getCockId() == 8) {
//				System.out.println("Cockid 8 gefunden. " + e.getValue());
//			}
//			else {
//				System.out.println("Cockid " + e.getKey().getCockId() + ", count " + e.getValue());
//			}
//		}

		Map<Cocktail, Long> cocktailsContainIngredients = foundCocktails.stream().distinct().collect(Collectors.toMap(cock -> cock, cock -> foundCocktails.stream().filter(entry -> entry == cock).count()));

		List<CocktailResult> matches = new ArrayList<>(foundCocktails.stream().distinct().map(cock -> new CocktailResult(cock, ((double) cocktailsContainIngredients.get(cock)) / ((double) numberOfIngredients))).collect(Collectors.toList()));
//		System.out.println("\n\nUnsortiert\n---------------------");
//		matches.forEach(x -> System.out.println("Cockid " + x.getCocktail().getCockId() + ", match " + x.getMatch()));

		matches.sort(new Comparator<CocktailResult>() {

			@Override
			public int compare(CocktailResult first, CocktailResult second) {
				
				double firstMatch = first.getMatch();
				double secondMatch = second.getMatch();
				
//				if((firstMatch - secondMatch) > 0) {
//					System.out.println("Größer 0");
//				}
//				else if((firstMatch - secondMatch) < 0)) {
//					System.out.println("Größer 0");
//				}
				
				return firstMatch == secondMatch ? 0 : firstMatch - secondMatch < 0 ? 1 : -1;
				
//				return (int) (firstMatch - secondMatch);
			}});
		
//		System.out.println("\n\nSortiert\n---------------------");
//		matches.forEach(x -> System.out.println("Cockid " + x.getCocktail().getCockId() + ", match " + x.getMatch()));
		
		return matches.size() < top ? matches : matches.subList(0, top);
	}
}