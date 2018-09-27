package edu.hm.cs.pblv.group3.main;

import java.util.Set;

import org.apache.commons.lang.StringEscapeUtils;


public class CockCsv {
	
	private long cockId;
	
	private String name;

	private String picture;
	
	private boolean alcoholic;
	
	private String instructions;
	
	private String category;
	
	private String glass;

	private Set<IngredientCsv> ingredients;
	

	public CockCsv(long cockId, String name, String picture, boolean alcoholic, String instructions, String category,
			String glass, Set<IngredientCsv> ingredients) {
		super();
		this.cockId = cockId;
		this.name = escapeSQL(name);
		this.picture = escapeSQL(picture);
		this.alcoholic = alcoholic;
		this.instructions = escapeSQL(instructions);
		this.category = escapeSQL(category);
		this.glass = escapeSQL(glass);
		this.ingredients = ingredients;
	}

	public long getCockId() {
		return cockId;
	}

	public void setCockId(long cockId) {
		this.cockId = cockId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public boolean isAlcoholic() {
		return alcoholic;
	}

	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public Set<IngredientCsv> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<IngredientCsv> ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("INSERT INTO Cocktail (cock_Id, name, picture, alcoholic, instructions, category, glass) VALUES (%d, '%s', '%s', %b, '%s', '%s', '%s');\r\n",
				cockId, name, picture, alcoholic, instructions, category, glass));
		
		for(IngredientCsv ing : ingredients) {
			sb.append(String.format("INSERT INTO INGREDIENT (Ingredient, Oz, Cocktail_cock_id) VALUES ('%s', '%s', %d);\r\n", ing.getIngredient(), ing.getOz(), cockId));
		}
		
		return sb.toString();
		
		
		
	}
	
	
	public static String escapeSQL(String s) {
		
		return StringEscapeUtils.escapeSql(s);
		
//		int length = s.length();
//		int newLength = length;
//		// first check for characters that might
//		// be dangerous and calculate a length
//		// of the string that has escapes.
//		for (int i = 0; i < length; i++) {
//			char c = s.charAt(i);
//			switch (c) {
//			case '\\':
//			case '\"':
//			case '\'':
//			case '\0': {
//				newLength += 1;
//			}
//				break;
//			}
//		}
//		if (length == newLength) {
//			// nothing to escape in the string
//			return s;
//		}
//		StringBuffer sb = new StringBuffer(newLength);
//		for (int i = 0; i < length; i++) {
//			char c = s.charAt(i);
//			switch (c) {
//			case '\\': {
//				sb.append("\\\\");
//			}
//				break;
//			case '\"': {
//				sb.append("\\\"");
//			}
//				break;
//			case '\'': {
//				sb.append("\\\'");
//			}
//				break;
//			case '\0': {
//				sb.append("\\0");
//			}
//				break;
//			default: {
//				sb.append(c);
//			}
//			}
//		}
//		return sb.toString();
	}
	

}
