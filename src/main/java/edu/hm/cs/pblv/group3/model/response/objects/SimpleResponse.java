package edu.hm.cs.pblv.group3.model.response.objects;

public class SimpleResponse {

	private String textToSpeech;

	public SimpleResponse(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	public String getTextToSpeech() {
		return textToSpeech;
	}

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}
}
