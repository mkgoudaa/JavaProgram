package Test;

public class NumberOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Number of Word in a String";
System.out.println(countWord(str));
	}
	public static int countWord(String str) {
		int wordCount=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== ' '  && str.charAt(i + 1)!=' ' && i<str.length()-1) {
				wordCount++;
				
			}
			
		}
		return wordCount;
		
	}

}
