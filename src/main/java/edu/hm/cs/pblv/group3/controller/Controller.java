package edu.hm.cs.pblv.group3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.hm.cs.pblv.group3.controller.util.JsonResponse;
import edu.hm.cs.pblv.group3.entities.Ingredient;
import edu.hm.cs.pblv.group3.services.IngredientService;

@RestController
public class Controller {
	
	private IngredientService is;
	
	@Autowired
	public Controller(IngredientService is) {
		this.is = is;		
	}
	
	@RequestMapping("/add")
	public String addTest(@RequestParam(value = "name") String name) {
		
		Ingredient igs = new Ingredient();
		igs.setName("NAME");
		igs.setIngredientId(1234);
		
		is.addIngredient(igs);
		
		return "Ok";			
	}
				
	@PostMapping("/test")
	public String test() {		
		JsonResponse response = new JsonResponse();
		return response.getResponse().toString();
	}

}
