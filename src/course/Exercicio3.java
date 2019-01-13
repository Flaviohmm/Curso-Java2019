package course;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n1, n2, n3;
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();

		if ((n1 > n2) && (n1 > n3)) {
			System.out.printf("Higher = %d", n1);
		} else if ((n2 > n1) && (n2 > n3)) {
			System.out.printf("Higher = %d", n2);
		} else {
			System.out.printf("Higher = %d", n3);
		}
		
		scanner.close();
	}

}
