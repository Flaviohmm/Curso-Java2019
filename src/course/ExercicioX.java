package course;

import java.util.Scanner;

public class ExercicioX {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", i,quadrado,cubo);
		}

		scanner.close();

	}

}
