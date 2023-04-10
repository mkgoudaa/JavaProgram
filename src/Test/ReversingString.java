package Test;
public class ReversingString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "I am good";
		int lengthstr=str.length();
		
		for(int i=(lengthstr-1);i>=0;i--) {
			char rev=str.charAt(i);
			System.out.print(rev);
		}
	}
}
