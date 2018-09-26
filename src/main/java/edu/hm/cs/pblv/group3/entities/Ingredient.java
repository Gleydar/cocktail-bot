package edu.hm.cs.pblv.group3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ingredientId;


	@Column(length = 128)
	private String name;

	@ManyToOne
	private Cocktail cocktail;


	public Ingredient() {

	}

	public Ingredient(long ingredientId, String name) {
		super();
		this.ingredientId = ingredientId;
		this.name = name;
	}

	public long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(long ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cocktail getCocktail() {
		return cocktail;
	}

	public void setCocktails(Cocktail cocktail) {
		this.cocktail = cocktail;
	}
}
