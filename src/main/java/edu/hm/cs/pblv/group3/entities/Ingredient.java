package edu.hm.cs.pblv.group3.entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ingredientId;


	@Column(length = 128)
	private String name;

	@ManyToMany(mappedBy = "cocktail")
	private ArrayList<Cocktail> cocktails;


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

	public ArrayList<Cocktail> getCocktails() {
		return cocktails;
	}

	public void setCocktails(ArrayList<Cocktail> cocktails) {
		this.cocktails = cocktails;
	}
}
