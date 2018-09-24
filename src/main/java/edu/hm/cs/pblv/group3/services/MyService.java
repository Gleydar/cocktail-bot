package edu.hm.cs.pblv.group3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.cs.pblv.group3.entities.Cocktail;
import edu.hm.cs.pblv.group3.entities.Ingredient;
import edu.hm.cs.pblv.group3.entities.Ingredients;
import edu.hm.cs.pblv.group3.repositories.CocktailRepository;
import edu.hm.cs.pblv.group3.repositories.IngredientRepository;
import edu.hm.cs.pblv.group3.repositories.IngredientsRepository;

@Service
public class MyService {
	
    private IngredientRepository ir;
	private IngredientsRepository isr;
	private CocktailRepository cr;
    
    @Autowired
    public MyService(IngredientRepository ir, IngredientsRepository isr, CocktailRepository cr) {
    	this.ir = ir;
    	this.isr = isr;
    	this.cr = cr;
    }
	
	public Ingredient addIngredient(Ingredient ingredient) {
		return ir.save(ingredient);
	}
	
	public Ingredients addIngredients(Ingredients ingredients) {
		return isr.save(ingredients);
	}

	public Cocktail addDCocktail (Cocktail cock) {
		return cr.save(cock);
	}
}
