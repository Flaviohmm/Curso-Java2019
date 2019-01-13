package course;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int mask = 0b00100000;
		int n = scanner.nextInt();

		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}

		scanner.close();

	}

}
