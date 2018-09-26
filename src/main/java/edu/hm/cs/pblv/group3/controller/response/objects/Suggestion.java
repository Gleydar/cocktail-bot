package edu.hm.cs.pblv.group3.controller.response.objects;

/**
 * @author Konstantin on 26.09.2018.
 */
public class Suggestion {

	private String title;

	public Suggestion(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
