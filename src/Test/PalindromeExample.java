package Test;
import java.util.Scanner;
public class PalindromeExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int no = sc.nextInt();
		temp = no;
		while (no > 0) {
			rem = no % 10;
			sum = (sum * 10) + rem;
			no = no / 10;
		}
		if (temp == sum) {
			System.out.println("Its a Palindrome Number");

		} else {
			System.out.println("Its not a Palindrome Number");
		}
	}
}