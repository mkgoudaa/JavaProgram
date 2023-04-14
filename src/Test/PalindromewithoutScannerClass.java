package Test;

public class PalindromewithoutScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 11211;
		int rev = 0;
		int rem;
		int temp = no;
		while (no != 0) {
			rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}

}
