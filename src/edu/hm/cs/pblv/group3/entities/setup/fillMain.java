package edu.hm.cs.pblv.group3.entities.setup;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fillMain {

	public fillMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transferingData data = new transferingData("resources/all_drinks.csv");
		String [] tmp = data.readCSVLine();
		tmp = data.readCSVLine();
		Set<String> ingredients = new HashSet<>();
		
		for (int i = 0; i < tmp.length;i++) {
			// Hier rausschreiben der Ingredients 10-24
			if (i >= 10  && i <= 24) {
				ingredients.add(tmp[i]);
			}
		}
		System.out.println(Arrays.asList(tmp));
		System.out.println(ingredients.toString());
	}

}
