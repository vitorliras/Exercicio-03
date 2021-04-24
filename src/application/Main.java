package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankCount;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankCount bc;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit valuew: ");
			double initialDeposit = sc.nextDouble();
			bc = new BankCount(holder, number, initialDeposit);
		}else {
			bc = new BankCount(holder, number);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bc);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bc.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(bc);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bc.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(bc);
	
		
		
		sc.close();
		
	}

}
