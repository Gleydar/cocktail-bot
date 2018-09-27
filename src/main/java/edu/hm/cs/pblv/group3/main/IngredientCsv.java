package edu.hm.cs.pblv.group3.main;

public class IngredientCsv {
	
	private String ingredient;
	
	private String oz;
	
	

	public IngredientCsv(String ingredient, String oz) {
		super();
		this.ingredient = CockCsv.escapeSQL(ingredient);
		this.oz = CockCsv.escapeSQL(oz);
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
