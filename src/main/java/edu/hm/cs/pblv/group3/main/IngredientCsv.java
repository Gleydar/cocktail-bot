package edu.hm.cs.pblv.group3.main;

import javax.persistence.Id;

public class IngredientCsv {
	
	private String ingredient;
	
	private String oz;
	
	

	public IngredientCsv(String ingredient, String oz) {
		super();
		this.ingredient = ingredient;
		this.oz = oz;
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
