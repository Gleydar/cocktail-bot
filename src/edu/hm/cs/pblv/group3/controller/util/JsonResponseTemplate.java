package edu.hm.cs.pblv.group3.controller.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author Konstantin on 19.09.2018.
 * ref: https://dialogflow.com/docs/fulfillment/how-it-works
 */
public class JsonResponseTemplate {

	public static ObjectNode getRoot() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode root = mapper.createObjectNode();

		// Add fulfillmentMessages
		ArrayNode fulfillmentMessages = mapper.createArrayNode();

		// Add payload specific for Actions on Google
		ObjectNode payload = mapper.createObjectNode();

		root.put("fulfillmentText", "Response!");
		root.set("payload", payload);
		root.set("fulfillmentMessages", fulfillmentMessages);
		return root;
	}
}
