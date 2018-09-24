package edu.hm.cs.pblv.group3.main;

import java.util.List;

public class CockCsv {
	
	private long cockId;
	
	private String name;

	private String picture;
	
	private boolean alcoholic;
	
	private String instructions;
	
	private String category;
	
	private String glass;
	
	private float rating;
	
	private List<IngredientCsv> ingredients;

	public CockCsv(long cockId, String name, String picture, boolean alcoholic, String instructions, String category,
			String glass, float rating, List<IngredientCsv> ingredients) {
		super();
		this.cockId = cockId;
		this.name = name;
		this.picture = picture;
		this.alcoholic = alcoholic;
		this.instructions = instructions;
		this.category = category;
		this.glass = glass;
		this.rating = rating;
		this.ingredients = ingredients;
	}

	public long getCockId() {
		return cockId;
	}

	public void setCockId(long cockId) {
		this.cockId = cockId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public boolean isAlcoholic() {
		return alcoholic;
	}

	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public List<IngredientCsv> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<IngredientCsv> ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("INSERT INTO Cocktail (cock_Id, name, picture, alcoholic, instructions, category, glass, rating) VALUES (%d, '%s', %s, %b, '%s', '%s', '%s', %f)\r\n",
				cockId, name, picture, alcoholic, instructions, category, glass, rating));
		
		for(IngredientCsv ing : ingredients) {
			sb.append(String.format("INSERT INTO INGREDIENT (Ingredient, Oz, Cocktail_cock_id) VALUES ('%s', %f, %d);\r\n", ing.getIngredient(), ing.getOz(), cockId));
		}
		
		return sb.toString();
		
		
		
	}
	
	

}
