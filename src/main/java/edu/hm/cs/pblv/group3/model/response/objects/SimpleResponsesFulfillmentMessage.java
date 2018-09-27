package edu.hm.cs.pblv.group3.model.response.objects;

import java.util.ArrayList;

public class SimpleResponsesFulfillmentMessage implements IFulfillmentMessage {

	private SimpleResponses simpleResponses;
	private String platform = "ACTIONS_ON_GOOGLE";

	public SimpleResponsesFulfillmentMessage() {
		this.simpleResponses = new SimpleResponses();
	}

	public SimpleResponses getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(SimpleResponses simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}
