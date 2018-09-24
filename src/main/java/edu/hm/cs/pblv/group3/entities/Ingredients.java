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
	
	public Ingredients() { }
	
	public Ingredients(Cocktail cocktail, Ingredient ingredient, int oz) {
		super();
		this.cocktail = cocktail;
		this.ingredient = ingredient;
		this.oz = oz;
	}

	public long getIngredientsId() {
		return ingredientsId;
	}

	public void setIngredientsId(long ingredientsId) {
		this.ingredientsId = ingredientsId;
	}

	public Cocktail getCocktail() {
		return cocktail;
	}

	public void setCocktail(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public int getOz() {
		return oz;
	}

	public void setOz(int oz) {
		this.oz = oz;
	}

	
	
	
	

}
