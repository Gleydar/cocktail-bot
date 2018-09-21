package edu.hm.cs.pblv.group3.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ingredientId;
	
	
	@Column(length = 128)
	private String name;
	
	

	public Ingredient(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}
	
	

}
