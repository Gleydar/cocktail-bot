package edu.hm.cs.pblv.group3.controller;

import com.fasterxml.jackson.databind.JsonNode;
import edu.hm.cs.pblv.group3.model.entities.CocktailResult;
import edu.hm.cs.pblv.group3.model.response.JsonResponse;
import edu.hm.cs.pblv.group3.model.response.objects.CarouselFulfillmentMessage;
import edu.hm.cs.pblv.group3.model.response.objects.CarouselItem;
import edu.hm.cs.pblv.group3.model.response.objects.SimpleResponse;
import edu.hm.cs.pblv.group3.model.response.objects.SimpleResponsesFulfillmentMessage;
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
		System.out.println(query);

		List<CocktailResult> results = cockService.findTopCocktails(query, 5);

		if (results.size() != 0) {
			CarouselFulfillmentMessage message = new CarouselFulfillmentMessage();
			for (CocktailResult result : results) {
				CarouselItem item = new CarouselItem(result.getCocktail().getName());
				item.setImageUri(result.getCocktail().getPicture());
				item.setDescription("Category: " + result.getCocktail().getCategory());
				message.getCarouselSelect().addItem(item);
			}

			response.addMessage(message);
			response.setResponseText("We found these cocktails, the best is a " + results.get(0).getMatch() + "% match.");
		} else {
			SimpleResponsesFulfillmentMessage message = new SimpleResponsesFulfillmentMessage();
			message.getSimpleResponses().addResponse(new SimpleResponse("We couldn't find anything for you"));
			response.addMessage(message);
		}

		return response.getResponse().toString();
	}
}