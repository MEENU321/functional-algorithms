package com.Stockreport;


import com.StockImplementation.*;
import com.StockInterface.*;
public class StockManagement {

	public static void main(String[] args) {
		StockDataImpl stock=new StockDataImpl();
		stock.fileRead();
		
		stock.calculate("SBI Bank");
	}

}

