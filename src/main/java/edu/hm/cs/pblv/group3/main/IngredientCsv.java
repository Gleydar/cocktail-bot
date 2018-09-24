package edu.hm.cs.pblv.group3.main;

import javax.persistence.Id;

public class IngredientCsv {
	
	private String ingredient;
	
	private int oz;
	
	

	public IngredientCsv(String ingredient, int oz) {
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

	public int getOz() {
		return oz;
	}

	public void setOz(int oz) {
		this.oz = oz;
	}
	
	

}
