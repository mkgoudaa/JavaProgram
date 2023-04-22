package Test;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
		//int no=1634;
		int temp=no;
		int result=0;
		int rem;
		while(no>0) {
			rem=no%10;
			result=(result) +(rem*rem*rem);
			no=no/10;
		}
		 if (temp == result) {
			 System.out.println("Yes. It is Armstrong No.");
	        }
	        else {
	        	System.out.println("No. It is not an Armstrong No.");
	        }
	}

}
