package edu.hm.cs.pblv.group3.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.hm.cs.pblv.group3.entities.setup.TransferingData;


public class FillMain {

	public FillMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferingData data = new TransferingData("src/main/resources/all_drinks.csv");
		String [] tmp = data.readCSVLine();
		Set<String> ingredients = new HashSet<>();
		tmp = data.readCSVLine();
		try {
			while (tmp != null) {	
				// System.out.println(count);
				for (int i = 9; i < 24;i++) {
				// Hier rausschreiben der Ingredients 10-24
				if (!tmp[i].equals("")) {
					
					ingredients.add(tmp[i]);
					
				}
				}
				tmp = data.readCSVLine();
				
			}
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		for (String s : ingredients) {
		//	System.out.println(s + ", ");
		}
		
	}

}