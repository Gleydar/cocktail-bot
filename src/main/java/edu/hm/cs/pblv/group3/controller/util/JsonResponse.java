package main.java.group3.controller.util;

import com.fasterxml.jackson.databind.JsonNode;
import main.java.group3.entities.Cocktail;

import java.util.Arrays;
import java.util.List;

/**
 * @author Konstantin on 19.09.2018.
 */
public class JsonResponse {

	private List<Cocktail> cocktails;
	private JsonNode response;

	public JsonResponse(Cocktail... cocktail) {
		this.cocktails = Arrays.asList(cocktail);
		this.addCocktails();
	}

	private void addCocktails() {
		this.response = JsonResponseTemplate.getRoot();
	}

	public JsonNode getResponse() {
		return response;
	}

}
