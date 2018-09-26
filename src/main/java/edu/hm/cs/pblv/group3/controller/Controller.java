package edu.hm.cs.pblv.group3.controller;

import com.fasterxml.jackson.databind.JsonNode;
import edu.hm.cs.pblv.group3.controller.response.JsonResponse;
import edu.hm.cs.pblv.group3.controller.response.objects.CarouselItem;
import edu.hm.cs.pblv.group3.controller.response.objects.FulfillmentMessage;
import edu.hm.cs.pblv.group3.entities.Cocktail;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
	List<Cocktail> cocktails;

	public Controller() {
			
	}
				
	@PostMapping("/cocktails")
	public String cocktails(@RequestBody JsonNode root) {
		String session = root.get("session").asText();
		String language; // TODO
		FulfillmentMessage message = new FulfillmentMessage();

		for (int i = 0; i < 3; i++) {
			CarouselItem item = new CarouselItem("test");
			message.getCarouselSelect().addItem(item);
		}

		JsonResponse response = new JsonResponse(session);
		response.addMessage(message);
		System.out.println(response.toString());
		return response.getResponse().toString();
	}

}