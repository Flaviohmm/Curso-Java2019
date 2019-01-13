package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
			
		System.out.print("Is there na initial deposit (y/n)? ");
		char op = scanner.nextLine().charAt(0);
		
		if(op == 'y' || op == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initBalance = scanner.nextDouble();
			account = new Account(number, holder, initBalance);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = scanner.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = scanner.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		scanner.close();
	}

}
