package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = scanner.nextDouble();
		rectangle.height = scanner.nextDouble();
		
		System.out.println("AREA = "+String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = "+String.format("%.2f", rectangle.perimeter()));
		System.out.println("DIAGONAL = "+String.format("%.2f", rectangle.diagonal()));
		
		scanner.close();

	}

}
