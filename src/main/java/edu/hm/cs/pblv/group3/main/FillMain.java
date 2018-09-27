package edu.hm.cs.pblv.group3.main;

import edu.hm.cs.pblv.group3.model.entities.CockCsv;
import edu.hm.cs.pblv.group3.view.setup.TransferingData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class FillMain {

	public FillMain() {
		// TODO Auto-generated constructor stub
	}

	public static int toNumber(String str) {
		return str.length() == 1 ? str.charAt(0) - 65 : ('Z' - 65) + (str.charAt(1) - 65);
	}

	
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/main/resources/data/data.sql");
			TransferingData data = new TransferingData("src/main/resources/all_drinks.csv");
			String[] tmp = data.readCSVLine();
			tmp = data.readCSVLine();
			
//			Arrays.asList(tmp).forEach(System.out::println);

			while (tmp != null) {
				Set<IngredientCsv> ingredients = new HashSet<>();
				for (int i = 9; i < 24; i++) {
					if (!tmp[i].equals("") && !tmp.equals(" ")) {
						try {
							ingredients.add(new IngredientCsv(tmp[i], tmp[i + 16]));
						} catch (ArrayIndexOutOfBoundsException e) {
							break;
						}
					}

				}

				// DatabaseUtils

				CockCsv cocktail = new CockCsv(Long.parseLong(tmp[toNumber("A")]), tmp[toNumber("B")],
						tmp[toNumber("G")], !tmp[toNumber("E")].equalsIgnoreCase("Non alcoholic"), tmp[toNumber("Y")],
						tmp[toNumber("F")], tmp[toNumber("H")], ingredients);

				tmp = data.readCSVLine();
				// System.out.println(cocktail.toString());
				writer.write(cocktail.toString());
			}
			writer.close();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static Set<String> getIngredients() {
		return null;

	}

}