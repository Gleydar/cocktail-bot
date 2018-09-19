package edu.hm.cs.pblv.group3.controller.util;

import com.fasterxml.jackson.databind.JsonNode;
import edu.hm.cs.pblv.group3.entities.Cocktail;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Konstantin on 19.09.2018.
 */
public class JsonResponse {

	private ArrayList<Cocktail> cocktails;
	private JsonNode response;

	public JsonResponse(Cocktail... cocktail) {
		this.cocktails = (ArrayList<Cocktail>) Arrays.asList(cocktail);
		this.addCocktails();
	}

	private void addCocktails() {
		this.response = JsonResponseTemplate.getRoot();
	}

	public JsonNode getResponse() {
		return response;
	}

}
