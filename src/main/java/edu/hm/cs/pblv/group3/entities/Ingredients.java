package edu.hm.cs.pblv.group3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ingredients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ingredientsId;
	
	@ManyToOne
	private Cocktail cocktail;
	
	@ManyToOne
	private Ingredient ingredient;
	
	private int oz;
	
	public Ingredients(Cocktail cocktail, Ingredient ingredient, int oz) {
		super();
		this.cocktail = cocktail;
		this.ingredient = ingredient;
		this.oz = oz;
	}

	public Cocktail getCocktail() {
		return cocktail;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public int getOz() {
		return oz;
	}
	
	
	

}
