package edu.hm.cs.pblv.group3.model.response.objects;

import java.util.ArrayList;

public class SimpleResponsesFulfillmentMessage implements IFulfillmentMessage {

	private ArrayList<SimpleResponse> simpleResponses;
	private String platform = "ACTIONS_ON_GOOGLE";

	public SimpleResponsesFulfillmentMessage(ArrayList<SimpleResponse> simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	public ArrayList<SimpleResponse> getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(ArrayList<SimpleResponse> simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}
