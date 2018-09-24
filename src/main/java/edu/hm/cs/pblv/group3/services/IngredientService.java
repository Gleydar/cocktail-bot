package edu.hm.cs.pblv.group3.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hm.cs.pblv.group3.entities.Ingredient;
import edu.hm.cs.pblv.group3.repositories.IngredientRepository;

@Service
@Transactional
public class IngredientService {
	
    private IngredientRepository ir;
    
    @Autowired
    public void setIngredientRepo(IngredientRepository ir) {
    	this.ir = ir;
    }
	
	public Ingredient addIngredient(Ingredient ingredient) {
		return ir.save(ingredient);
	}

}
