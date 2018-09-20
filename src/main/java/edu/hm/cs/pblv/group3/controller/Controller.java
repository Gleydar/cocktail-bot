package edu.hm.cs.pblv.group3.controller;

import com.fasterxml.jackson.databind.JsonNode;
import edu.hm.cs.pblv.group3.controller.util.JsonResponse;
import edu.hm.cs.pblv.group3.entities.Cocktail;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
	List<Cocktail> cocktails;

	public Controller() {
			
	}
				
	@PostMapping("/cocktails")
	public String cocktails(@RequestBody JsonNode root) {
		String session = root.get("session").asText();
		JsonResponse response = new JsonResponse(session);
		return response.getResponse().toString();
	}

}
