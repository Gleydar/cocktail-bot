package edu.hm.cs.pblv.group3.main;


import edu.hm.cs.pblv.group3.entities.setup.TransferringData;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FillMain {

	public FillMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferringData data = new TransferringData("resources/all_drinks.csv");
		String[] tmp = data.readCSVLine();
		tmp = data.readCSVLine();
		Set<String> ingredients = new HashSet<>();

		for (int i = 0; i < tmp.length; i++) {
			// Hier rausschreiben der Ingredients 10-24
			if (i >= 10 && i <= 24) {
				ingredients.add(tmp[i]);
			}
		}
		System.out.println(Arrays.asList(tmp));
		System.out.println(ingredients.toString());
	}

}
