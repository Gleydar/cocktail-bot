package edu.hm.cs.pblv.group3;

import java.sql.SQLException;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import edu.hm.cs.pblv.group3.entities.Ingredient;

@SpringBootApplication
public class Main {
	
//	public static Ingredient ing;s
	
	public static void main(String... args) throws SQLException {
		SpringApplication app = new SpringApplication(Main.class);
		if (System.getenv("PORT") != null) {
			app.setDefaultProperties(Collections.singletonMap("server.port", System.getenv("PORT")));
		}
		app.run(args);		
	}

}
