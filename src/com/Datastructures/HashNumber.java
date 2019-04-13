package com.Datastructures;


		import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;
		import java.util.HashMap;
		import java.util.Map;
		import com.bridgelabz.functionalutil4.SinglyLinkedList;


		public class HashNumber {

			public static void main(String[] args) throws IOException 
			{
				SinglyLinkedList<Integer> ds = new SinglyLinkedList<>();
				SinglyLinkedList<Integer> ds1 = null;

				Map<Integer, SinglyLinkedList<Integer>> map = new HashMap<Integer, SinglyLinkedList<Integer>>();
				for (int i = 0; i <= 10; i++) {
					ds1 = new com.bridgelabz.functionalutil4.SinglyLinkedList<>();
					map.put(i, ds1);
				}
				FileReader fr = new FileReader("C:\\Users\\Meenu Robert\\Desktop\\hh\\ee.txt");
				BufferedReader br = new BufferedReader(fr);
				int rem;
				String num;
				String delimitor = ",";
				while ((num = br.readLine()) != null) {
					String number[] = num.split(delimitor);
					for (String numb : number) {
						ds.addElement(Integer.parseInt(numb));
					}
				}
				System.out.println("The numbers in the file are:");
				ds.printList();
				System.out.println();
				int len = ((Map<Integer, SinglyLinkedList<Integer>>) ds).size();

				String[] array = new String[len];
				String[] array2 = ds.convArray(array);
				int[] res = ds.convertIntArray(array2);
				int[] sorted = ds.sort(res);

				System.out.println("The sorted array are:");
				for (int s : sorted)
					System.out.print(s + " ");
				System.out.println();
				System.out.println("Diving each number by 11");
				for (int i = 0; i < sorted.length; i++) {
					rem = sorted[i] % 11;
					if (map.isEmpty()) {
						ds1.addElement(sorted[i]);
						map.put(rem, ds1);
					} else {
						ds1 = map.get(rem);
						if (((Map<Integer, SinglyLinkedList<Integer>>) ds1).size() == 0) {
							ds1.addElement(sorted[i]);
						} else {
							if (!((SinglyLinkedList<Integer>) ds1).search(sorted[i])) {

								((SinglyLinkedList<Integer>) ds1).addElement(sorted[i]);
							}
						}
						map.put(rem, ds1);
					}
				}

				for (int i = 0; i < map.size(); i++) {
					SinglyLinkedList<Integer> list = map.get(i);
					System.out.print(i + "--> ");
					list.printList();
					System.out.println();
				}


				br.close();
			}

		}
	

	