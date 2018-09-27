package edu.hm.cs.pblv.group3.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	public Cocktail() {

	}

	public Cocktail(long cockId, String name, String picture, boolean alcoholic, String instructions, String category,
			String glass) {
		super();
		this.cockId = cockId;
		this.name = name;
		this.picture = picture;
		this.alcoholic = alcoholic;
		this.instructions = instructions;
		this.category = category;
		this.glass = glass;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (alcoholic ? 1231 : 1237);
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + (int) (cockId ^ (cockId >>> 32));
		result = prime * result + ((glass == null) ? 0 : glass.hashCode());
		result = prime * result + ((instructions == null) ? 0 : instructions.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cocktail other = (Cocktail) obj;
		if (alcoholic != other.alcoholic)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (cockId != other.cockId)
			return false;
		if (glass == null) {
			if (other.glass != null)
				return false;
		} else if (!glass.equals(other.glass))
			return false;
		if (instructions == null) {
			if (other.instructions != null)
				return false;
		} else if (!instructions.equals(other.instructions))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
		return true;
	}

}
