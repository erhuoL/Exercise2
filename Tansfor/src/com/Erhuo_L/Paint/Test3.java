package com.Erhuo_L.Paint;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.Erhuo_L.model.*;
import com.Erhuo_L.parse.Parser;
import com.google.gson.*;

public class Test3 {
	
	public static void main(String[] args) throws Exception {
//		String s = "{ tag: \"text\", text: \"hello\" }";
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\erhuo1\\Desktop\\a.json"),"UTF-8"));
		
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(reader).getAsJsonObject();
		System.out.println(obj.get("tag").getAsString());
		
		Parser p = new Parser();
		Layout l = p.parse(obj);
		l.pp();
		
		return;
	}

}
