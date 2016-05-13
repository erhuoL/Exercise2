package com.Erhuo_L.Paint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import com.Erhuo_L.model.Layout;
import com.Erhuo_L.parse.Parser;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {
	public static void main(String[] args) throws Exception {
		// args = new String[] { "F:\\github\\erhuoL-ex\\Tansfor\\example\\e1.json" };
		if (args.length != 1) {
			System.out.println("usage: tansfor [json layout desc]");
			return;
		}
		
		String fileName = args[0];
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(fileName),
						"UTF-8"));
		
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = jsonParser.parse(reader).getAsJsonObject();
		System.out.println(jsonObject.get("tag").getAsString());
		
		Parser parser = new Parser();
		Layout layout = parser.parse(jsonObject);
		layout.pp();
		
		String dir = new File(fileName).getParent();
		
		PageFrame fr = new PageFrame(layout, 450, 600, dir);
		fr.setVisible(true);
	}
}
