package com.StockImplementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.StockInterface.StockData;
import com.Stockmodel.StockModel;

public class StockDataImpl implements StockData {
	JSONArray jsonArray;
	List<StockModel> stockList = new ArrayList<>();
	StockModel stock=new StockModel();
	JSONObject jobject = new JSONObject();
	@Override
	public void fileRead() {
		JSONParser parser = new JSONParser();
		{

			try {
				FileReader fr= new FileReader("C:\\Users\\Meenu Robert\\eclipse-workspace\\Bridgelabzprograms\\src\\com\\oopscommercial\\json.json");
				jsonArray = (JSONArray) parser.parse(fr);
				System.out.println(jsonArray);
				for (Object obj : jsonArray) {
					StockModel stockmodel = new StockModel();
					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					Long noOfShare =  (Long) jobject.get("share number");
					Long price = ((Long) jobject.get("share price"));
					stockmodel.setStockName(name);   //setWeight(weight);
					stockmodel.setNoOfShare(noOfShare);
					stockmodel.setPrice(price);
					System.out.println(stockmodel.toString());
					stockList.add(stockmodel);
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
	public void calculate(String name) {

		stockList.forEach(stocks -> {
			System.out.println("Ttal share of " + stocks.getStockName() + "is" +(stocks.getNoOfShare()*stocks.getPrice()));
		});

	}

	public void write() {


	}

}

