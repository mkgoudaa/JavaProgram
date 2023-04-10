package Test;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no = sc.nextInt();
		if (no % 2 == 0) {
			System.out.println(no + " is Even Numer");
		} else {
			System.out.println(no + " is Odd Numer");
		}
	}
}
