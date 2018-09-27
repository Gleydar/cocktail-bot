package edu.hm.cs.pblv.group3.controller;

import com.fasterxml.jackson.databind.JsonNode;
import edu.hm.cs.pblv.group3.model.entities.CocktailResult;
import edu.hm.cs.pblv.group3.model.entities.Ingredient;
import edu.hm.cs.pblv.group3.model.response.JsonResponse;
import edu.hm.cs.pblv.group3.model.response.objects.CarouselFulfillmentMessage;
import edu.hm.cs.pblv.group3.model.response.objects.CarouselItem;
import edu.hm.cs.pblv.group3.view.services.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

		CarouselFulfillmentMessage message = new CarouselFulfillmentMessage();
		Set<Ingredient> ingredients = new HashSet<>(); // TODO add Marcels Class
		List<CocktailResult> results = cockService.findTopCocktails(ingredients, 5);

		for (CocktailResult result : results) {
			CarouselItem item = new CarouselItem(result.getCocktail().getName());
			item.setImageUri(result.getCocktail().getPicture());
			message.getCarouselSelect().addItem(item);
		}

		JsonResponse response = new JsonResponse(session);
		response.addMessage(message);
		return response.getResponse().toString();
	}
}