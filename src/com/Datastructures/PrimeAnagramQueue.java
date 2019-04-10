package com.Datastructures;

import com.bridgelabz.functionalutil.FunctionalUtil;

import com.bridgelabz.functionalutil4.QueueLinkedList;

public class PrimeAnagramQueue {

	public static void main(String[] args) {

		FunctionalUtil.primeAnagrams();
		QueueLinkedList<QueueLinkedList<Integer>> queue = new QueueLinkedList<QueueLinkedList<Integer>>();

		for (int i = 0; i <= queue.getSize(); i++) {
			QueueLinkedList<Integer> primeanagrams = queue.remove();
			for (int j = 0; j < primeanagrams.getSize(); j++) {
				System.out.print(primeanagrams.remove() + "\t");
			}
			System.out.println();
		}
	}
}
