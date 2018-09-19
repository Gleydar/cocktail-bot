package edu.hm.cs.pblv.group3.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hm.cs.pblv.group3.entities.Cocktail;
import edu.hm.cs.pblv.group3.entities.CocktailGlass;

@RestController
public class Controller {
	
	
	List<Cocktail> cocktails;
	
				
	public Controller() {
		
//		List<Cocktail> cocktails = Arrays.asList(
//				new Cocktail(true, "'57 Chevy with a White License Plate", Arrays.asList(CocktailCategory.COCKTAIL), "http://www.thecocktaildb.com/images/media/drink/qyyvtu1468878544.jpg", CocktailGlass.HIGHBALL, "1. Fill a rocks glass with ice\r\n2.add white creme de cacao and vodka\r\n3.stir",  
//			
			
	}
				
	@RequestMapping("/test")
	public String test() {
		return "bestanden";
	}

}
