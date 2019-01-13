package course;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = scanner.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg;
		avg = sum/vect.length;
		System.out.printf("AVERAGE HEIGHT = %.2f",avg);
		
		scanner.close();
	}

}
