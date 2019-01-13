package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Student student = new Student();

		student.name = scanner.nextLine();
		student.nota1 = scanner.nextDouble();
		student.nota2 = scanner.nextDouble();
		student.nota3 = scanner.nextDouble();

		System.out.println("FINAL GRADE = " + student.grade());

		if (student.grade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.print(student.missing());
		}

		scanner.close();
	}

}
