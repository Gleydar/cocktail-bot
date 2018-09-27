package edu.hm.cs.pblv.group3.services;

import edu.hm.cs.pblv.group3.entities.Cocktail;

public class CocktailResult {

	private final Cocktail cocktail;
	private final double match;

	public CocktailResult(Cocktail cocktail, double match) {
		super();
		this.cocktail = cocktail;
		this.match = match;
	}

	public Cocktail getCocktail() {
		return cocktail;
	}

	public double getMatch() {
		return match;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cocktail == null) ? 0 : cocktail.hashCode());
		long temp;
		temp = Double.doubleToLongBits(match);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CocktailResult other = (CocktailResult) obj;
		if (cocktail == null) {
			if (other.cocktail != null)
				return false;
		} else if (!cocktail.equals(other.cocktail))
			return false;
		if (Double.doubleToLongBits(match) != Double.doubleToLongBits(other.match))
			return false;
		return true;
	}
	
	
}