package edu.hm.cs.pblv.group3.controller.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author Konstantin on 19.09.2018.
 * ref: https://dialogflow.com/docs/fulfillment/how-it-works
 */
public class JsonResponseTemplate {

	public static ObjectNode getDefaultTemplate() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode root = mapper.createObjectNode();

		// Add fulfillmentMessages (we use this with Actions on Google as well)
		ArrayNode fulfillmentMessages = mapper.createArrayNode();

		// Add payload specific for Actions on Google
		ObjectNode payload = mapper.createObjectNode();

		// TODO add context_back_to_start
		ArrayNode contexts = mapper.createArrayNode();

		root.set("outputContexts", contexts);
		//	root.set("payload", payload);
		root.set("fulfillmentMessages", fulfillmentMessages);
		root.put("fulfillmentText", "Here are some suggestions"); // TODO language!
		return root;
	}
}
