package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = scanner.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = scanner.nextDouble();
		System.out.print("Tax: ");
		employee.tax = scanner.nextDouble();

		System.out.println("Employee: " + employee.toPrint());

		System.out.print("Which percentage to increase salary? ");
		double percentage = scanner.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Update data: " + employee.toPrint());
		
		scanner.close();
	}

}
