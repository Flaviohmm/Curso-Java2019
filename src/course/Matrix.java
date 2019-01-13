package course;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		double[][] mat = new double[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(" " + mat[i][i]);
		}

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println();
		System.out.println("Negative numbers = " + count);

		scanner.close();
	}

}
