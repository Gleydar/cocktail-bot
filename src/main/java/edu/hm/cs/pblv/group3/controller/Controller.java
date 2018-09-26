package edu.hm.cs.pblv.group3.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import edu.hm.cs.pblv.group3.controller.response.JsonResponse;
import edu.hm.cs.pblv.group3.controller.response.objects.CarouselFulfillmentMessage;
import edu.hm.cs.pblv.group3.controller.response.objects.CarouselItem;
import edu.hm.cs.pblv.group3.entities.Cocktail;
import edu.hm.cs.pblv.group3.services.CocktailResult;
import edu.hm.cs.pblv.group3.services.CocktailService;

@RestController
public class Controller {
	List<Cocktail> cocktails;
	
	private CocktailService cockService;

	@Autowired
	public Controller(CocktailService cockService) {
		this.cockService = cockService;
	}
	
	public Controller() {
			
	}

	/**
	 * This is the main method to handle the reponses
	 * @param root The JsonNode request object
	 * @return A json Representation of our {@link edu.hm.cs.pblv.group3.controller.response.objects.IFulfillmentMessage}
	 */
	@PostMapping("/cocktails")
	public String cocktails(@RequestBody JsonNode root) {
		String session = root.get("session").asText();
		String language; // TODO
		CarouselFulfillmentMessage message = new CarouselFulfillmentMessage();

		for (int i = 0; i < 3; i++) {
			CarouselItem item = new CarouselItem("test" + i);
			message.getCarouselSelect().addItem(item);
		}

		JsonResponse response = new JsonResponse(session);
		response.addMessage(message);
		return response.getResponse().toString();
	}
	
	@PostMapping("/find")
	public OutputObj cocktails2(@RequestBody InputObj input, @RequestParam(value = "top", defaultValue = "5") int top) {
		
		List<CocktailResult> result = cockService.findTopCocktails(input.getIngredients(), top);
		
		return new OutputObj(result);
		
	}

}

class InputObj {
	
	Set<String> ingredients;
	
	

	public InputObj(Set<String> ingredients) {
		super();
		this.ingredients = ingredients;
	}



	public Set<String> getIngredients() {
		return ingredients;
	}
	
	
	
	
}

class OutputObj {
	
	List<CocktailResult> cocktails;

	public OutputObj(List<CocktailResult> cocktails) {
		super();
		this.cocktails = cocktails;
	}

	public List<CocktailResult> getCocktails() {
		return cocktails;
	}
}