package Test;

import java.util.Scanner;

public class SwappingWithOutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st No :");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd No :");
		int num2 = sc.nextInt();
		num1 = num1 + num2;
		
		num2 = num1 - num2;
		num1 = num1 - num2; 
		
		System.out.println("After swapping the 1st no" + num1);
		System.out.println("After swapping the 2nd no" + num2);

	}

}
