package com.bglabz.algorithms;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class UtilityClass {


		

			public static <T> void main(String[] args)
			{
				System.out.println("Enter your choice");
				int choice=FunctionalUtil.getInt();
				System.out.print("Enter the array size:");
				int n=FunctionalUtil.getInt();
				System.out.println("Enter array elements: ");
				String [] arr=new String[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=FunctionalUtil.getstring();
				}
				

				switch(choice)
				{
				case 1:
					System.out.println("Perform binary search");
					System.out.println("Sorted array:");
					FunctionalUtil.BubbleSort(arr);//sorting array before performing binary search
					System.out.println("Enter the key:");
					String key=FunctionalUtil.getstring();
					long starttime=System.nanoTime();
					FunctionalUtil.BinarySearch(arr, key);
					long endTime = System.nanoTime();
					long elapsed_time = (long) FunctionalUtil.stopWatch(starttime, endTime);
					System.out.println("The time taken to perform binary search operation is "+ elapsed_time+" ns");
					break;
				case 2:
					System.out.println("Perform bubble sort");
					System.out.println("Sorted array is:");
					long starttime1=System.nanoTime();
					FunctionalUtil.BubbleSort(arr);
					long endTime1 = System.nanoTime();
					long elapsed_time1 = (long) FunctionalUtil.stopWatch(starttime1, endTime1);
					System.out.println("The time taken to perform bubble sorts operation is "+ elapsed_time1+" ns");
					break;

				case 3:
					System.out.println("Perform insertion sort");
					System.out.println("Sorted array:");
					long starttime11=System.nanoTime();
					FunctionalUtil.insertionSort(arr);
					long endTime11 = System.nanoTime();
					long elapsed_time11 = (long) FunctionalUtil.stopWatch(starttime11, endTime11);
					System.out.println("The time taken to perform Insertion sort operation is "+ elapsed_time11+" ns");
					break;

				default:
					break;
				}

			}

		}

	