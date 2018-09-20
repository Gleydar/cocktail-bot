package edu.hm.cs.pblv.group3.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	private float rating;
	
	@OneToMany(mappedBy="cocktail")
	private List<Ingredients> ingredients = new ArrayList<>();

	public Cocktail(long cockId, String name, String picture, boolean alcoholic, String instructions, String category,
			String glass, float rating, List<Ingredients> ingredients) {
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

	public String getName() {
		return name;
	}

	public String getPicture() {
		return picture;
	}

	public boolean isAlcoholic() {
		return alcoholic;
	}

	public String getInstructions() {
		return instructions;
	}

	public String getCategory() {
		return category;
	}

	public String getGlass() {
		return glass;
	}

	public float getRating() {
		return rating;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}
	
	
	
	
	
	

}
