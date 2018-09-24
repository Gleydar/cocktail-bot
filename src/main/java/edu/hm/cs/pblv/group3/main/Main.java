package edu.hm.cs.pblv.group3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

@ComponentScan(basePackages = "edu.hm.cs.pblv.group3")
@SpringBootApplication
public class Main {
	
	public static void main(String... args) {
		SpringApplication app = new SpringApplication(Main.class);
		if (System.getenv("PORT") != null) {
			app.setDefaultProperties(Collections.singletonMap("server.port", System.getenv("PORT")));
		}
		app.run(args);
	}

}
