package com.java;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.java.pojo.Result;
import com.java.pojo.Store;

public class c {

	static String c = "{\"errorCode\":\"0\",\"reason\":null,\"result\":[{\"id\":4,\"productLabel\":\"HJ-A-1-1-8*1\",\"shelfNum\":\"HJ-A-1-1-8,PJ4XOB2000137\",\"status\":0,\"warehouseId\":1,\"addTime\":1460717595396}]}";

	static JsonSerializer<Date> ser = new JsonSerializer<Date>() {
		@Override
		public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
			return src == null ? null : new JsonPrimitive(src.getTime());
		}
	};

	static JsonDeserializer<Date> deser = new JsonDeserializer<Date>() {
		@Override
		public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			return json == null ? null : new Date(json.getAsLong());
		}
	};

	public static void main(String[] args) {
		// try {
		// Gson gson = new GsonBuilder().registerTypeAdapter(Date.class,
		// ser).registerTypeAdapter(Date.class, deser)
		// .create();
		// Result<List<Store>> result = gson.fromJson(c, new
		// TypeToken<Result<List<Store>>>() {
		// }.getType());
		//
		// System.out.println(result.getResult().get(0).getAddTime());
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		B b = new B();

		A a = b;

		if (a instanceof B) {
			System.out.println("11111");
		}
		
		String c = "1&";
		System.out.println(c.split("&")[0]);
		System.out.println(c.split("&")[1]);
	}

}
