package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		
		Product product = new Product();
		
		System.out.print("Name: ");
		product.name = scanner.nextLine();
		System.out.print("Price: ");
		product.price = scanner.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scanner.nextInt();
		
		product.toPrint();
		
		System.out.print("\nEnter the number of product to be added in stock: ");
		int quantity = scanner.nextInt();
		product.AddProducts(quantity);
		product.toPrint();
		
		System.out.print("\nEnter the number of product to be removed in stock: ");
		quantity = scanner.nextInt();
		product.RemoveProducts(quantity);
		product.toPrint();
		
		scanner.close();
	}

}
