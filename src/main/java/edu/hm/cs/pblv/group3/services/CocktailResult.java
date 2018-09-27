package edu.hm.cs.pblv.group3.services;

import edu.hm.cs.pblv.group3.entities.Cocktail;

public class CocktailResult implements Comparable<CocktailResult> {

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
	public int compareTo(CocktailResult otherResult) {

		double otherMatch = otherResult.getMatch();
		double thisMatch = this.getMatch();

		return otherMatch == thisMatch ? 0 : otherMatch < thisMatch ? -1 : 1;

		// return (int) otherResult.getMatch() - this.getMatch();
	}
}