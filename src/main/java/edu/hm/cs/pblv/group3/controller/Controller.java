package edu.hm.cs.pblv.group3.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.hm.cs.pblv.group3.controller.util.JsonResponse;
import edu.hm.cs.pblv.group3.entities.Cocktail;
import edu.hm.cs.pblv.group3.entities.Ingredient;
import edu.hm.cs.pblv.group3.repositories.CocktailRepository;
import edu.hm.cs.pblv.group3.services.CocktailService;
import edu.hm.cs.pblv.group3.services.IngredientService;

@RestController
public class Controller {
	
	private CocktailService cockService;
	private IngredientService ingredientService;
	
	private CocktailRepository cockRepo;
	
	@Autowired
	public Controller(IngredientService is, CocktailService cockServicec, CocktailRepository cockRepo) {
		this.ingredientService = ingredientService;
		this.cockService = cockService;
		this.cockRepo = cockRepo;
	}
	
	@RequestMapping("/find")
	public retClass addTest(@RequestParam(value = "rating", defaultValue = "4.0") float rating) {
		
		List<Cocktail> retList = cockRepo.findAll();
		System.out.println("Found " + retList.size() + " entries");
		retList.sort(new Comparator<Cocktail>() {

			@Override
			public int compare(Cocktail cock1, Cocktail cock2) {
				return (int) (cock2.getRating() - cock1.getRating());
			}});
		
		return new retClass(retList);	
	}
	
	
	@RequestMapping("/add")
	public String addTest(@RequestParam(value = "name") String name) {
		
		Ingredient igs = new Ingredient();
		igs.setIngredient(name);
		igs.setOz(20);
		
		ingredientService.addIngredient(igs);
		
		return "Ok";			
	}
				
	@PostMapping("/test")
	public String test() {		
		JsonResponse response = new JsonResponse();
		return response.getResponse().toString();
	}

}

class retClass {
	
	private List<Cocktail> cockList;

	public retClass(List<Cocktail> cockList) {
		super();
		this.cockList = cockList;
	}

	public List<Cocktail> getCockList() {
		return cockList;
	}

	public void setCockList(List<Cocktail> cockList) {
		this.cockList = cockList;
	}
	
	
	
}
