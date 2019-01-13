package course;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// 35
		int n1 = sc.nextInt();
		
		// Bob Brown
		sc.nextLine();
		String name = sc.nextLine();
		
		// F
		char gender = sc.next().charAt(0);
		
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		
		// 4.32
		double n2 = sc.nextDouble();
		
		// Maria F 23 1.68
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}

}
