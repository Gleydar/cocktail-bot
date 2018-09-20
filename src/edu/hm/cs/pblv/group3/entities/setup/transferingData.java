package edu.hm.cs.pblv.group3.entities.setup;

import java.io.BufferedReader;
import java.io.IOException;

public class transferingData {
	
	BufferedReader reader;
	
	transferingData(String dataPath) {
		try {
            reader =   new java.io.BufferedReader(
                        new java.io.FileReader(
                            new java.io.File(dataPath)
                        )
                    );
		 } catch (Exception e) {
	            e.printStackTrace();
	       }
	}
	
	
	
	// Daten auslesen
	
	
	String[] readCSVLine() {
		String tmp = "";
		try {
			tmp = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] tmp2 = tmp.split(";");
		
		return tmp2;
	}
	
	
	
	// Daten aufbereiten
	
	
}
