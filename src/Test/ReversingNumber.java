package Test;
public class ReversingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 3456789;
		int rem, rev = 0;
		while (no> 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.print(rev);
	}
}
