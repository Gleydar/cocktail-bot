package edu.hm.cs.pblv.group3.entities;

import java.util.List;
import java.util.Map;

public class Cocktail {
	
	private boolean alcoholic;
	private String name;
	private List<CocktailCategory> categories;
	private String picture;
	private CocktailGlass glass;
	private String instruction;
	private Map<CocktailIngredient, Integer> ingrediences;
	
	
	
	public Cocktail(boolean alcoholic, String name, List<CocktailCategory> categories, String picture,
			CocktailGlass glass, String instruction, Map<CocktailIngredient, Integer> ingrediences) {
		super();
		this.alcoholic = alcoholic;
		this.name = name;
		this.categories = categories;
		this.picture = picture;
		this.glass = glass;
		this.instruction = instruction;
		this.ingrediences = ingrediences;
	}
	public boolean isAlcoholic() {
		return alcoholic;
	}
	public String getName() {
		return name;
	}
	public List<CocktailCategory> getCategories() {
		return categories;
	}
	public String getPicture() {
		return picture;
	}
	public CocktailGlass getGlass() {
		return glass;
	}
	public String getInstruction() {
		return instruction;
	}
	public Map<CocktailIngredient, Integer> getIngrediences() {
		return ingrediences;
	}
	
	
	
	
	

}
