package Test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int no=sc.nextInt();
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Given number is a primenuber");
		}else {
			System.out.println("Given number is not a primenuber");
		}

	}

}
