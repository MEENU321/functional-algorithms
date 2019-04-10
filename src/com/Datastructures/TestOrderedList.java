package com.Datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.functionalutil.FunctionalUtil;

import com.bridgelabz.functionalutil4.SinglyLinkedList;

public class TestOrderedList {

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) throws IOException {
		// OrderedList1<Integer> list = new OrderedList1<>();
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		File file = new File("C:\\Users\\Meenu Robert\\Desktop\\hh\\ww.txt");
		@SuppressWarnings("resource")
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = ",";
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}
		for (String k : array) {
			list.addElement(k);
		}
		list.traverse();
		list.get();
		System.out.println("Enter the key value: ");
		String key = FunctionalUtil.getstring();

		SinglyLinkedList<String> newList = list.searchKey(list, key);
				newList.traverse();
		FileWriter fw = new FileWriter("C:\\Users\\Meenu Robert\\Desktop\\hh\\ww.txt");
		String data = newList.toString();
		fw.write(data);

		fw.close();

		System.out.println("ordered List -" + data);

	}
}