package edu.hm.cs.pblv.group3.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

@IdClass(ZusammengesetzerPK.class)
@Entity
public class Ingredient {

	@Id
	@Column(length = 128)
	private String name;

	@Id
	@ManyToOne
	private Cocktail cocktail;
	
	private String oz;

	public Ingredient() {

	}

	public Ingredient(String name, Cocktail cocktail, String oz) {
		super();
		this.cocktail = cocktail;
		this.name = name;
		this.oz = oz;
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

	public void setCocktail(Cocktail cocktail) {
		this.cocktail = cocktail;
	}

	public String getOz() {
		return oz;
	}

	public void setOz(String oz) {
		this.oz = oz;
	}

	
	
}
