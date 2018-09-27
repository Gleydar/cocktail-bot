package edu.hm.cs.pblv.group3.model.response;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import edu.hm.cs.pblv.group3.model.response.objects.Context;
import edu.hm.cs.pblv.group3.model.response.objects.IFulfillmentMessage;
import edu.hm.cs.pblv.group3.model.entities.Cocktail;

import java.util.Arrays;
import java.util.List;

/**
 * @author Konstantin on 19.09.2018.
 */
public class JsonResponse {

	private List<Cocktail> cocktails;
	private JsonNode response;
	private String session;

	public JsonResponse(String session, Cocktail... cocktail) {
		this.session = session;
		this.cocktails = Arrays.asList(cocktail);
		this.response = JsonResponseTemplate.getDefaultTemplate();
		this.addCocktails();
		this.addContext(session);
	}

	private void addContext(String session) {
		ArrayNode contexts = (ArrayNode) response.get("outputContexts");
		ObjectMapper mapper = new ObjectMapper();
		contexts.add(mapper.valueToTree(new Context(session)));
	}

	public void addMessage(IFulfillmentMessage message) {
		ArrayNode messages = (ArrayNode)response.get("fulfillmentMessages");
		ObjectMapper mapper = new ObjectMapper();
		messages.add(mapper.valueToTree(message));
	}

	public void setResponseText(String text) {
		((ObjectNode)response).put("fulfillmentMessage", text);
	}

	private void addCocktails() {
		// TODO
	}

	public JsonNode getResponse() {
		return response;
	}
}
