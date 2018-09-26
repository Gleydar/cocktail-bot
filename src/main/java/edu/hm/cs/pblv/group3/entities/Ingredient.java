package edu.hm.cs.pblv.group3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ZusammengesetzerPK.class)
public class Ingredient {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long ingId;
	
	@Id
	@ManyToOne
	private Cocktail cocktail;
	
	@Id
	private String ingredient;
	
	private String oz;
	
	public Ingredient() { }

	public Ingredient(Cocktail cocktail, String ingredient, String oz) {
		super();
		this.cocktail = cocktail;
		this.ingredient = ingredient;
		this.oz = oz;
	}



	public Cocktail getCocktail() {
		return cocktail;
	}

	public void setCocktail(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getOz() {
		return oz;
	}

	public void setOz(String oz) {
		this.oz = oz;
	}
	

	

	
	
	
	

}
