package com.Erhuo_L.model;

import java.io.*;

import com.Erhuo_L.parse.Parser;
import com.google.gson.*;



public class main {
	public static void main(String [] sad) throws Exception{
		PaintContext ctx = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\erhuo1\\Desktop\\a.json"),"UTF-8"));
		
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(reader).getAsJsonObject();
		System.out.println(obj.get("tag").getAsString());
		
		Parser p = new Parser();
		Layout l = p.parse(obj);
		l.pp();
		
	}
}
