//package edu.hm.cs.pblv.group3.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import edu.hm.cs.pblv.group3.entities.Ingredient;
//import edu.hm.cs.pblv.group3.repositories.IngredientRepository;
//
//@Component
////@Service
//public class DatabaseInitializer {
//	
////	@Autowired
//	private IngredientRepository ir;
//	
////	@Autowired
//	private MyService service;
//	
//	@Autowired
//	public DatabaseInitializer(IngredientRepository ir, MyService service) {
//		
//		this.ir = ir;
//		this.service = service;
//		
//		System.out.println("Number of Ingredients in DB:" + ir.findAll().size());
//		
//		Ingredient ig = new Ingredient();
//		ig.setName("NeuerEintrag");
//		
//		ig = service.addIngredient(ig);
//		
//		System.out.println("Number of Ingredients in DB:" + ir.findAll().size());
//		
//	}
//
//}
