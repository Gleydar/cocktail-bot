package edu.hm.cs.pblv.group3.main;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import edu.hm.cs.pblv.group3.entities.Ingredient;

import java.sql.SQLException;
import java.util.Collections;

@ComponentScan(basePackages = "edu.hm.cs.pblv.group3")
@SpringBootApplication
public class Main {
	
	public static void main(String... args) throws SQLException {
		SpringApplication app = new SpringApplication(Main.class);
		if (System.getenv("PORT") != null) {
			app.setDefaultProperties(Collections.singletonMap("server.port", System.getenv("PORT")));
		}
		app.run(args);
		
//		new Ingredient(ingredients, name)
		
	}

}
