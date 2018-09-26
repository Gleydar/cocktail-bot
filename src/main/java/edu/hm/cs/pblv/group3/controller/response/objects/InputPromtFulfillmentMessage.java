package edu.hm.cs.pblv.group3.controller.response.objects;

import java.util.ArrayList;

/**
 * @author Konstantin on 26.09.2018.
 */
public class InputPromtFulfillmentMessage implements IFulfillmentMessage {

	public ArrayList<String> text;
	public String platform = "ACTIONS_ON_GOOGLE";

	public InputPromtFulfillmentMessage() {
		text = new ArrayList<>();
		text.add("Here are your suggestions");
	}

	public ArrayList<String> getText() {
		return text;
	}

	public void setText(ArrayList<String> text) {
		this.text = text;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}
