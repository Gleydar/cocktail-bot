package edu.hm.cs.pblv.group3.model.entities;

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
}