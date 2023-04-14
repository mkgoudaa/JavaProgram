package Test;

public class PrimeNum {
public static void main (String[] args) {
	int no=6;
	int temp=0;
	for(int i=2;i<no;i++) {
		if(no%i==0) {
			temp=temp+1;
		}
	}
	if(temp==0) {
		System.out.println("prime");
	}else {
	System.out.println("not prime");
}

}
}