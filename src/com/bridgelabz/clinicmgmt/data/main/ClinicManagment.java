package com.bridgelabz.clinicmgmt.data.main;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ClinicManagment {

	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();

		try {

			Object obj = parser.parse(new FileReader("f:\\Patient.json"));
//			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);

			String name = (String) jsonObject.get("name");
			System.out.println(name);

			long age = (Long) jsonObject.get("id");
			System.out.println(id);

			// loop array
			JSONArray msg = (JSONArray) jsonObject.get("Patient");
			Iterator<String> iterator = msg.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
