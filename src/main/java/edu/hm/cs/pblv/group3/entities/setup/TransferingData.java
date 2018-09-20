package edu.hm.cs.pblv.group3.entities.setup;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class TransferingData {
	
	BufferedReader reader;
	
	public TransferingData(String dataPath) {
		try {
			File f = new File(dataPath);
			if (!f.exists()) {
				System.out.println("variable = " + "asdf");
			}
            reader =   new java.io.BufferedReader(
                        new java.io.FileReader(f)
                    );
		 } catch (Exception e) {
	            e.printStackTrace();
	       }
	}
	
	
	
	// Daten auslesen
	
	
	public String[] readCSVLine() {
		String tmp = "";
		try {
			tmp = reader.readLine();
			
			if (tmp != null) {
				String[] tmp2 = tmp.split(",");
				return tmp2;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			return null;
		
	}
	
	
	
	// Daten aufbereiten
	
	
}
