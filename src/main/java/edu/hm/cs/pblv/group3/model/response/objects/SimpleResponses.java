package edu.hm.cs.pblv.group3.model.response.objects;

import java.util.ArrayList;

public class SimpleResponses {

	private ArrayList<SimpleResponse> simpleResponses;

	public SimpleResponses() {
		this.simpleResponses = new ArrayList<>();
	}

	public void addResponse(SimpleResponse response) {
		this.simpleResponses.add(response);
	}

	public ArrayList<SimpleResponse> getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(ArrayList<SimpleResponse> simpleResponses) {
		this.simpleResponses = simpleResponses;
	}
}
