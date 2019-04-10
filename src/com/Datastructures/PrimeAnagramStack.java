package com.Datastructures;

import com.bridgelabz.functionalutil.FunctionalUtil;
import com.bridgelabz.functionalutil4.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeAnagramStack {

	public static void main(String[] args) {

		StackLinkedList<Integer> st = new StackLinkedList<Integer>();

		List<Integer> list1 = new ArrayList<Integer>();

		list1 = FunctionalUtil.primeNum();

		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list1.size(); j++) {
				if (FunctionalUtil.isanagramInt((list1.get(i)), (list1.get(j)))) {
					st.push(list1.get(i));
					st.push(list1.get(j));
				}
			}
		}
		System.out.println("Printing the elements in reverse order using pop function of stack");

		while (!st.isEmpty()) {

			System.out.println(st.pop() + " " + st.pop());
		}
	}
}
