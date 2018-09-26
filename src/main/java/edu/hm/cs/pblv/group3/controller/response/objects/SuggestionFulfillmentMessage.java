package edu.hm.cs.pblv.group3.controller.response.objects;

import java.util.ArrayList;

/**
 * @author Konstantin on 26.09.2018.
 */
public class SuggestionFulfillmentMessage implements  IFulfillmentMessage {
	private ArrayList<Suggestion> suggestions;
	private String platform = "ACTIONS_ON_GOOGLE";

	public SuggestionFulfillmentMessage() {
		suggestions = new ArrayList<>();
		suggestions.add(new Suggestion("new drink?"));
		suggestions.add(new Suggestion("close"));
	}
}
