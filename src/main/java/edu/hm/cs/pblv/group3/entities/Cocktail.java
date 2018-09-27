package edu.hm.cs.pblv.group3.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cocktail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cockId;
	
	@Column(length = 256)
	private String name;
	
	@Column(length = 1024)
	private String picture;
	
	private boolean alcoholic;
	
	@Column(length = 2048)
	private String instructions;
	
	@Column(length = 128)
	private String category;
	
	@Column(length = 128)
	private String glass;
	
	@OneToMany(mappedBy="cocktail")
	private List<Ingredient> ingredients = new ArrayList<>();

	public Cocktail() {

	}

	public Cocktail(long cockId, String name, String picture, boolean alcoholic, String instructions, String category,
			String glass, List<Ingredient> ingredients) {
		super();
		this.cockId = cockId;
		this.name = name;
		this.picture = picture;
		this.alcoholic = alcoholic;
		this.instructions = instructions;
		this.category = category;
		this.glass = glass;
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

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
