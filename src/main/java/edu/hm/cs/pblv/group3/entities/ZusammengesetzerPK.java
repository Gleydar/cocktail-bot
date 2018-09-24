package edu.hm.cs.pblv.group3.entities;

import java.io.Serializable;

//@Embeddable
public class ZusammengesetzerPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Cocktail cocktail;
	private String ingredient;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cocktail == null) ? 0 : cocktail.hashCode());
		result = prime * result + ((ingredient == null) ? 0 : ingredient.hashCode());
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
		ZusammengesetzerPK other = (ZusammengesetzerPK) obj;
		if (cocktail == null) {
			if (other.cocktail != null)
				return false;
		} else if (!cocktail.equals(other.cocktail))
			return false;
		if (ingredient == null) {
			if (other.ingredient != null)
				return false;
		} else if (!ingredient.equals(other.ingredient))
			return false;
		return true;
	}
	
	

}
