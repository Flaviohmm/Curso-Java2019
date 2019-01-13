package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Program5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = scanner.nextInt();

		List<Employee2> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employoee #" + i + ":");
			System.out.print("Id: ");
			Integer id = scanner.nextInt();
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble();
			list.add(new Employee2(id, name, salary));
			System.out.println();
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = scanner.nextInt();
		Employee2 employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = scanner.nextDouble();
			employee.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee2 obj : list) {
			System.out.println(obj);
		}

		scanner.close();

	}

}
