package edu.hm.cs.pblv.group3.controller;

import edu.hm.cs.pblv.group3.controller.util.JsonResponse;
import edu.hm.cs.pblv.group3.entities.Cocktail;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
	
	
	List<Cocktail> cocktails;
	
				
	public Controller() {
		
//		List<Cocktail> cocktails = Arrays.asList(
//				new Cocktail(true, "'57 Chevy with a White License Plate", Arrays.asList(CocktailCategory.COCKTAIL), "http://www.thecocktaildb.com/images/media/drink/qyyvtu1468878544.jpg", CocktailGlass.HIGHBALL, "1. Fill a rocks glass with ice\r\n2.add white creme de cacao and vodka\r\n3.stir",  
//			
			
	}
				
	@PostMapping("/test")
	public String test() {
		JsonResponse response = new JsonResponse();
		return response.getResponse().toString();
	}

}
