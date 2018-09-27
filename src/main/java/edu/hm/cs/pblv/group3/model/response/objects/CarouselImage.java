package edu.hm.cs.pblv.group3.model.response.objects;

/**
 * @author Konstantin on 21.09.2018.
 */
public class CarouselImage {

	private String imageUri;
	private String accessibilityText;

	public CarouselImage() {
		imageUri = "https://i.imgur.com/6mcbhC8.jpg";
		accessibilityText = "Default description";
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getAccessibilityText() {
		return accessibilityText;
	}

	public void setAccessibilityText(String accessibilityText) {
		this.accessibilityText = accessibilityText;
	}
}
