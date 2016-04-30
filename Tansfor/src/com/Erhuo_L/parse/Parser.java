package com.Erhuo_L.parse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.Erhuo_L.model.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Parser {
	private Div readDiv(JsonObject obj, Div o) {
		int[] weights = new Gson().fromJson(obj.get("weights"), int[].class);
		o.setWeights(weights);
		if (obj.has("interval")) {
			o.setInterval(obj.get("interval").getAsInt());
		} else {
			o.setInterval(0);
		}
		
		JsonArray partsArr = obj.get("parts").getAsJsonArray();
		List<Layout> partsList = new ArrayList<>();
		for (JsonElement elem : partsArr) {
			partsList.add(parse(elem.getAsJsonObject()));
		}
		o.setParts(partsList.toArray(new Layout[partsList.size()]));
		
		return o;
	}
	
	private HorzDiv parseHorzDiv(JsonObject obj) {
		return (HorzDiv) readDiv(obj, new HorzDiv());
	}
	private VertDiv parseVertDiv(JsonObject obj) {
		return (VertDiv) readDiv(obj, new VertDiv());
	}
	private PicHolder parsePicHolder(JsonObject obj) {
		PicHolder o = new PicHolder();
		o.setSrc(obj.get("src").getAsString());
		return  o;
	}
	
	
	
	private TextHolder parseTextHolder(JsonObject obj) {
		TextHolder o = new TextHolder();
		o.setText(obj.get("text").getAsString());
//		o.setFont(obj.get("font").getAsString());
//		o.setSize(obj.get("size").getAsInt());
		return o;
	}
	
	public Layout parse(JsonObject obj) {
		String tag = obj.get("tag").getAsString();
		switch (tag) {
		case "TextHolder":
			return parseTextHolder(obj);
		case "HorzDiv":
			return parseHorzDiv(obj);
		case "VertDiv":
			return parseVertDiv(obj);
		case "PicHolder":
			return  parsePicHolder(obj);
			
		default:
			return null;
		}
	}

	
}
