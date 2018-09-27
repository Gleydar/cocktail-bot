package edu.hm.cs.pblv.group3.controller;

import com.fasterxml.jackson.databind.JsonNode;
import edu.hm.cs.pblv.group3.model.entities.CocktailResult;
import edu.hm.cs.pblv.group3.model.response.JsonResponse;
import edu.hm.cs.pblv.group3.model.response.objects.CarouselFulfillmentMessage;
import edu.hm.cs.pblv.group3.model.response.objects.CarouselItem;
import edu.hm.cs.pblv.group3.view.services.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

	private CocktailService cockService;

	@Autowired
	public Controller(CocktailService cockService) {
		this.cockService = cockService;
	}

	/**
	 * This is the main method to handle the reponses
	 *
	 * @param root The JsonNode request object
	 * @return A json Representation of our {@link edu.hm.cs.pblv.group3.model.response.objects.IFulfillmentMessage}
	 */
	@PostMapping("/cocktails")
	public String cocktails(@RequestBody JsonNode root) {
		String session = root.get("session").asText();
		String language; // TODO
		String query = root.get("queryResult").get("queryText").asText();
		JsonResponse response = new JsonResponse(session);

		CarouselFulfillmentMessage message = new CarouselFulfillmentMessage();
		
		List<CocktailResult> results = cockService.findTopCocktails(query, 5);

		if (results.size() != 0) {
			for (CocktailResult result : results) {
				CarouselItem item = new CarouselItem(result.getCocktail().getName());
				item.setImageUri(result.getCocktail().getPicture());
				message.getCarouselSelect().addItem(item);
			}

			response.addMessage(message);
			response.setResponseText("We found these cocktails, the best is a " + results.get(0).getMatch() + "% match.");
		} else {
			response.setResponseText("Sorry, but we couldn't find any cocktails for you");
		}

		return response.getResponse().toString();
	}
	
	@GetMapping("/test")
	public OutputObj cocktails(@RequestParam(value = "input") String input) {
		
		List<CocktailResult> results = cockService.findTopCocktails(input, 5);
		
		return new OutputObj(results);
		
		
	}
	
	
}

class OutputObj {
	
	List<CocktailResult> cocktails;
	
	public OutputObj() {}

	public OutputObj(List<CocktailResult> cocktails) {
		super();
		this.cocktails = cocktails;
	}

	public List<CocktailResult> getCocktails() {
		return cocktails;
	}
}