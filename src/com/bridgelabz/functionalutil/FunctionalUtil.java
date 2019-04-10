package com.bridgelabz.functionalutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionalUtil {

	public static Scanner sc = new Scanner(System.in);

	public static int integermodel() {
		return sc.nextInt();
	}

	public static String getstring() {
		return sc.next();
	}

	public static double doublemodel() {
		return sc.nextDouble();
	}

//prime factors 

	public static void primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i + "");
				n = n / i;
			}
		}

	}

	// Gambler
	public static void gamblerGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stake or cash ");
		double c = sc.nextDouble();
		System.out.println("Enter goal ");
		double g = sc.nextDouble();
		System.out.println("Enter trial ");
		double tr = sc.nextDouble();
		int bets = 0;// no.of bets made
		int wins = 0;
		int loss = 0;// no.of games won
		// repeat trials times
		for (int t = 0; t < tr; t++) {
			while (c > 0 && c < g) {
				bets++;
				if (Math.random() < 0.5) {
					c++;
					wins++;
				} else
					c--;
				loss++;
			}
			if (c == g)
				wins++;
		}
		System.out.println(wins + " wins of " + tr);
		System.out.println("Percent of games won = " + 100.0 * wins / tr);
		System.out.println("Avg # bets           = " + 1.0 * bets / tr);

//finding leap year
	}

	public static boolean findingLeapYear(int year) {

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			return true;
		else
			return false;
 
	}

//quadratic equation
	public static void findingRoots(double a, double b, double c) {
		double root1, root2;
		Scanner sc = new Scanner(System.in);

		// double a = 2, b = 4, c = 5;

		double delta = b * b - 4 * a * c;
//  for real and different roots
		if (delta > 0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
// for real and equal roots
		else if (delta == 0) {
			root1 = root2 = -b / (2 * a);

			System.out.format("root1 = root2 = %.2f;", root1);
		}
// If roots are not real
		else {
			double v = -b / (2 * a);
			double u = Math.sqrt(-delta) / (2 * a);

			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", v, u, v, u);
		}
	}

//finding eucleadian distance

	public static double findDis(int x, int y) {
//Scanner sc = new Scanner(System.in);
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return d;
	}

//windchill
	public static double findingWindChill(double temperature, double speed) {
		double windchill = 32.74 + 0.6215 * temperature - 32.75 * Math.pow(speed, 0.16)
				+ 0.4275 * temperature * Math.pow(speed, 0.16);
		return windchill;
	}

//temperature conversion from fahrentocelcius
	public static double fahrentoCelcius(double n) {
		double celcius = n - 32 * 5 / 9;
		return celcius;
	}

//findpower
	public static void findPower(int n) {
		int i = 0;
		int power = 1;

		if (n <= 31) {
			System.out.println("powers of 2 that are less than or equal to 2^n,n=" + n);

			while (i <= n)

			{
				System.out.println("2^" + i + "=" + power);
				power = power * 2;
				i++;
			}
		} else
			System.out.println("overflow of int range");
	}

//printmatrix	

	public static void ml() {
		Scanner sc = new Scanner(System.in);

	}
//Array 2D

	public static void enterMatrixData(Scanner sc, int[][] Matrix, int r, int c) {
		System.out.println("Enter Matrix Elements");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				Matrix[i][j] = sc.nextInt();
			}
		}
	}

	public static void printMatrix(int[][] Matrix, int r, int c) {
		System.out.println(" Matrix is : ");

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {

				System.out.print(Matrix[i][j] + "\t");
			}

			System.out.println();
		}
	}

//string replace
	public static void stringReplace() {
		String str1 = new String("username");
		System.out.println("Original String: ");
		String str3 = new String("hello<<username>>,how are you");
		System.out.println(str3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String str2 = sc.next();
		sc.close();

		if (str2.length() > 3) {
			String str4 = str3.replaceAll(str1, str2);
			System.out.println("Replaced string is : ");
			System.out.println(str4);
		} else {
			System.out.println("Name must have atleast 3 characters!try again...");
		}
	}

//harmonic
	public static void harmonicNumber(int n) {

		float harmonic = 1;
		for (int i = 2; i <= n; i++) {
			harmonic = harmonic + (float) 1 / i;
		}

		System.out.println(harmonic);

	}

//Headtail
	public static void toss(int flips) {
		double heads = 0;
		double tails = 0;
		double count = 1;
		double result = 0;

		while (count <= flips) {
			result = Math.random();
			if (result <= 0.5) {

				heads++;
			}

			else {
				tails++;
			}
			count++;
		}

		System.out.println(+heads + "is the number of heads");
		System.out.println(+tails + "is the number of tails");
		double hp = (heads / flips) * 100;
		double tp = (tails / flips) * 100;
		System.out.println("Head percentage : " + hp);
		System.out.println("Tail percentage : " + tp);

	}

//finding sum of 3 integers
	public static void findingThreeIntegers() {
		int count = 0;

		int givenArray[] = { 1, 2, 4, -3, -1, 5, 6 };
		for (int i = 0; i < givenArray.length; i++) {
			for (int j = i + 1; j < givenArray.length; j++) {
				for (int k = j + 1; k < givenArray.length; k++) {
					if (givenArray[i] + givenArray[j] + givenArray[k] == 0) {
						{

							System.out.println(
									"Numbers found : " + givenArray[i] + "," + givenArray[j] + " and " + givenArray[k]);
							count++;
							int d = count;
							System.out.println("Total number of pairs found : " + d);
						}

					}
				}
			}
		}
	}// stopwatch

	public static double stopWatch(long now, long start) {
		double time = (now - start) / 1000;
		return time;

	}

//Replace username using regex function
	public static String replaceUserName(String sentance, String userName) {
		final String REGEX_USERNAME = "<<userName>>";
		Pattern p = Pattern.compile(REGEX_USERNAME);
		Matcher m = p.matcher(sentance);
		String message = m.replaceFirst(userName);

		return message;
	}

//coupon onlynumbers
	public static int number(int n) {
		boolean[] collectedValue = new boolean[n];
		int count = 0;
		int distinctNum = 0;
		while (distinctNum < n) {
			int num = (int) (Math.random() * 2);
			count++;
			if (!collectedValue[num]) {
				distinctNum++;
				System.out.println(distinctNum);
				collectedValue[num] = true;
			}
		}
		return count;
	}

	public static int getInt() {

		return sc.nextInt();
//gambler2
	}

	public static void gambling(int cash, int bet, int goal) {
		int trial = 0;
		int w = 0;
		int l = 0;
		while (cash != 0 || cash == goal) {
			double rs = Math.random();
			System.out.println(rs);
			if (rs <= 0.5) {
				cash = cash + bet;
				w++;
			} else {
				cash = cash - bet;
				l++;
			}
			trial++;
		}
		System.out.println("no.of wins" + w);
		System.out.println("no.of loss" + l);
		int wp = (w * 100) / trial;
		int lp = (l * 100) / trial;
		System.out.println("wins percentage" + wp);
		System.out.println("loss percentage" + lp);
	}

//coupon numbers3
	public static void isCoupon(int n) {
		int count = 0, i = 0, j = 0;
		int a[] = new int[n];
		Random t = new Random();
		for (i = 0; i < n; i++) {
			a[i] = t.nextInt(n);
			System.out.println(a[i] + "");
		}
		System.out.println("Distinct coupon:");

		for (i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
				if (a[i] == a[j])
					;
				break;
			}
			if (i == j)
				count++;
		}
		System.out.println(count);

	}
//TIC TAC TOE-user and user

	public static String board[][] = new String[3][3];
	static String cp = "x";

	public static void changeplayer() {
		if (cp == "x") {
			cp = "o";
		} else {
			cp = "x";
		}
	}

	public static boolean isBoardFull() {
		boolean isFull = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == " ") {
					isFull = false;
				}
			}
		}
		return isFull;
	}

	public static void printBoard() {
		System.out.println("--------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.print(" |");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " |");
			}
			System.out.println();
			System.out.println("------------");
		}
	}

	public static boolean CheckForWin() {
		return (checkRowsForWin() || checkColumns() || checkDiagonal());
	}

	public static boolean checkRowsForWin() {

		for (int i = 0; i < 3; i++) {

			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {

				return true;

			}

		}

		return false;
	}

	public static boolean checkColumns() {
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkDiagonal() {

		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
				|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

	}

	public static boolean checkRowCol(String board2, String board3, String board4) {

		return ((board2 != "-" && (board2 == board3) && (board3 == board4)));

	}

	public static boolean placeMark(int i, int j) {
		if ((i >= 0) && (i < 3)) {
			if ((j >= 0) && (j < 3)) {
				if (board[i][j] == " ") {
					board[i][j] = cp;
					return true;

				}
			}
		}
		return false;
	}

//Tic Tac Toe -user and computer
	static final int USER = 1;
	static final int EMPTY = 0;
	static final int NONE = 0;

	static final int COMPUTER = 2;
	static final int STALEMATE = 3;

	public static char printChar(int b) {
		switch (b) {
		case EMPTY:
			return ' ';
		case USER:
			return 'X';
		case COMPUTER:
			return 'O';
		}
		return ' ';
	}

	public static int checkWinner(int[][] board) {
		// Check if someone won
		// Check horizontals

		// top row
		if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
			return board[0][0];

		// middle row
		if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
			return board[1][0];

		// bottom row
		if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
			// return board[2][0];

			// Check verticals

			// left column
			if ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
				return board[0][0];

		// middle column
		if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
			return board[0][1];

		// right column
		if ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
			return board[0][2];

		// Check diagonals
		// one diagonal
		if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
			return board[0][0];

		// the other diagonal
		if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
			return board[0][2];

		// Check if the board is full
		if (board[0][0] == EMPTY || board[0][1] == EMPTY || board[0][2] == EMPTY || board[1][0] == EMPTY
				|| board[1][1] == EMPTY || board[1][2] == EMPTY || board[2][0] == EMPTY || board[2][1] == EMPTY
				|| board[2][2] == EMPTY)
			return NONE;

		return STALEMATE;
	}

	public static int computer_move(int[][] board) {
		int move = (int) (Math.random() * 9);

		while (board[move / 3][move % 3] != EMPTY)
			move = (int) (Math.random() * 9);

		return move;
	}

	// monthly payment
	public static double monthlyPayment(double pr, double r, double n) {
		double payment = pr * r / 1 - Math.pow(1 + r, -n);
		return payment;
	}

	public static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			if (res == 0)
				return m;

			// If x greater, ignore left half
			if (res >= 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return -1;
	}

//utility class
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int i = 0, j = 0, w;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j <= i; j++) {
				if (array[j].compareTo(array[i]) > 0) {
					T temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--)
						array[w] = array[w - 1];
					array[w] = temp;
				}
			}
		}
		for (T kl : array)
			System.out.println(kl + " ");
		System.out.println(" ");
	}
//BUBBLE SORT 

	public static <T extends Comparable<T>> void BubbleSort(T[] array) {
		int i;
		int n = array.length;
		for (i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.println(array[i] + " ");
		}
	}

//BINARY SEARCH 
	public static <T extends Comparable<T>> void BinarySearch(T[] arr, T key) {

		int low = 0, high = arr.length - 1, mid = 0;
		mid = (low + high) / 2;
		while (low <= high) {
			if (key.compareTo(arr[mid]) > 0)
				low = mid + 1;
			else if (arr[mid].equals(key)) {
				System.out.println("key element found at index " + mid);
				break;
			} else
				high = mid - 1;

			mid = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("key element not found");
		}
	}
// CHECKING NUMBERS FOR PALINDROME AND ANAGRAM

	public static ArrayList<Integer> palindrome(ArrayList<Integer> a) {

		System.out.print("Palindrome numbers from 1 to N:");
		for (int i = 0; i < a.size(); i++) {
			int rev = 0;
			int n = a.get(i);
			int m = a.get(i);
			while (n > 0) {
				int b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;

			}
			if (rev == m) {
				System.out.print(rev + " ,");
			}

		}
		return a;
	}

	public static void primeAnagrams(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (FunctionalUtil.isAnagram(a.get(i), a.get(j))) {
					System.out.println(a.get(i) + " " + a.get(j));
				}
			}
		}
	}

// CHECKING ANAGRAMS OF NUMBERS
	public static boolean isAnagram(int n1, int n2) {
		int[] num1 = intArray(n1);
		int[] num2 = intArray(n2);
		if (num1.length != num2.length)
			return false;
		else {
			for (int i = 0; i < num1.length; i++) {
				if (num1[i] != num2[i])
					return false;
			}
		}

		return true;

	}

	private static int[] intArray(int n1) {
		// TODO Auto-generated method stub
		return null;
	}

// PRIME NUMBERS
	public static void prime() {
		String primeNumbers = "";
		for (int i = 0; i <= 1000; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {

				primeNumbers = primeNumbers + i + " ";

			}
		}

		System.out.println(primeNumbers);

	}

	// PRIME NUMBERS

	public static ArrayList<Integer> primeNum() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c = c + 1;

				}
			}
			if (c == 2)

			{
				ar.add(i);
			}

		}
		return ar;
	}

	static boolean areAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}

//insertsort
	public static String[] insertSort(String array[], int f) {
		String temp = "";
		for (int i = 0; i < f; i++) {
			for (int j = i + 1; j < f; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static int find(int n) {

		int low = 0, high = 63, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			Scanner r = new Scanner(System.in);
			int c = r.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	static int i, total;
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	public static void countofNotes(int amount) {
		if (amount / notes[i] != 0) {
			total += (amount / notes[i]);
			System.out.println(notes[i] + "rs notes:" + amount / notes[i]);
			amount = amount % notes[i];

		}
		i++;
		if (amount == 0) {
			System.out.println("Total notes:" + total);
			return;
		}
		countofNotes(amount);
	}

	public static void decToBinary(int n) {

		int[] binaryNum = new int[1000];

		int i = 0;
		while (n > 0) {

			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	public static boolean areAnagrams(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		// }

		// public static void display(int arr[]) {
		// int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static int dayofWeek(int d, int m, int y) {
		int yO = y - (14 - m) / 12;
		int x = yO + yO / 4 - yO / 100 + yO / 400;
		int mO = m + 12 * ((14 - m) / 12) - 2;
		int dO = (d + x + (31 * mO) / 12) % 7;
		return dO;
	}

	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {
				comp = left[lIndex].compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else {
					merged[mIndex++] = left[lIndex++];
				}
			}
		}
		return merged;
	}

	public static String primeNum11() {
		int i = 0;
		int num = 0;
		String primenumbers = " ";
		for (i = 1; i <= 1000; i++) {
			int counter = 0;

			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;

				}
			}

			if (counter == 2) {
				primenumbers = primenumbers + i + "  ";
			}
		}
		return primenumbers;
	}

	public static void SqrtNum(double c) {
		double t = c;
		double epsilon = (1e-15);

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println(t);
	}

	public static void toBinary(int n) {
		int[] binaryNum = new int[1000];

		int i = 0;
		while (n > 0) {

			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	public static int swapNibbles(int x) {
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}
	//program for primeanagram
	public static List<Integer> primeAnagrams() {
		ArrayList<Integer> anagramlist = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j < 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				anagramlist.add(j);
		}
		for (int i = 0; i < anagramlist.size(); i++) {
			for (int a = i + 1; a < anagramlist.size(); a++) {
				if (isanagramInt(anagramlist.get(i), anagramlist.get(a))) {
					System.out.println(anagramlist.get(i) + " " + anagramlist.get(a));
				}
			}
		}
		return anagramlist;
	}

	/**
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean isanagramInt(Integer n1, Integer n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param n
	 * @return
	 */
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	
}
