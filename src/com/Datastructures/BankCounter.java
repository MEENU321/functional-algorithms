package com.Datastructures;



import com.bridgelabz.functionalutil.FunctionalUtil;
import com.bridgelabz.functionalutil4.Queue;

public class BankCounter {

	public static void main(String[] args) {
		double curBalance = 10000;
		double amount = 0;
		boolean notDone = true;
		Queue<Integer> d = new Queue<Integer>();
		while (d.capacity > 0) {
			d.enque(d.capacity);
			System.out.println();
			System.out.println("---------Welcome to Banking System-----------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance ");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
			int answer = FunctionalUtil.getInt();
			switch (answer) {
			case 1:
				System.out.println("How much do you want to deposit? ");
				amount = FunctionalUtil.doublemodel();
				System.out.println(amount);
				curBalance = Deposit(amount, curBalance);
				System.out.println("Your Deposit is: " + amount);
				System.out.println("Your Balance is: " + curBalance);
				break;
			case 2:
				System.out.println("How much do you want to withdraw? ");
				amount = FunctionalUtil.doublemodel();
				System.out.println(amount);
				if (amount > curBalance) {
					System.out.println("You cannot overdraw your account.Try again.");
					break;
				} else {
					curBalance = Withdrawal(amount, curBalance);
					System.out.println("Your Withdrawal is: " + amount);
					System.out.println("Your Balance is: " + curBalance);
					break;
				}
			case 3:
				checkBalance(curBalance);
				break;
			case 4:
				notDone = false;
				int c = d.deque();
				System.out.println("The Number of People in Queue is: " + c);
				break;
			default:
				System.out.println("Not Valid input, try again.");
				break;
			}
		}
		System.out.println("Thank you and have a nice day!");
		
	}

	public static double Deposit(double amount, double curBalance) {
		curBalance += amount;
		return curBalance;
	}

	public static double Withdrawal(double amount, double curBalance) {
		curBalance -= amount;
		return curBalance;
	}

	public static void checkBalance(double curBalance) {
		System.out.println("Your current balance is: " + curBalance);
	}

}
