package Test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int fact = 1;
		int value = sc.nextInt();
		while (value != 0) {
			fact = fact * value;
			value--;
		}
		System.out.println(fact);
	}

}
