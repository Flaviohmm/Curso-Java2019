package aplication;

import java.util.Scanner;

import entities.Rent;

public class Program4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = scanner.nextInt();

		Rent[] vect = new Rent[10];

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			System.out.print("Room: ");
			int room = scanner.nextInt();
			vect[room] = new Rent(name, email);
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		scanner.close();

	}

}
