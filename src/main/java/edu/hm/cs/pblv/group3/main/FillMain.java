package edu.hm.cs.pblv.group3.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.hm.cs.pblv.group3.entities.Ingredient;
import edu.hm.cs.pblv.group3.entities.setup.TransferingData;
import edu.hm.cs.pblv.group3.repositories.IngredientRepository;


public class FillMain {
	
	public static int toNumber(String str) {
		return str.length() == 1 ? str.charAt(0) - 65 : ('Z' - 65) + (str.charAt(1) - 65);
	}

	
	public FillMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/main/resources/data/data.sql");
			TransferingData data = new TransferingData("src/main/resources/all_drinks.csv");
			String [] tmp = data.readCSVLine();
			tmp = data.readCSVLine();
			
			
				while (tmp != null) {	
					Map <String, String> ingredients = new HashMap();
					CockCsv cocktail = new CockCsv(Long.parseLong(tmp[toNumber("A")]),tmp[toNumber("B")],tmp[toNumber("G")],!tmp[toNumber("E")].equalsIgnoreCase("Non alcoholic"),tmp[toNumber("Y")],tmp[toNumber("F")],
							tmp[toNumber("H")],Long.parseLong(tmp[toNumber("I")]));
					
					
					tmp = data.readCSVLine();
					
				}
				writer.close();	
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
		
	}
	
	

}

