package Test;

public class NumberofWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Number of word in Sentence";
		//System.out.println(str.split("\\s").length);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				count++;
		}
		System.out.println(count + 1);
//other way to do
		checkNumberOfWord(str);
	}

	static void checkNumberOfWord(String s) {
		System.out.println(s.split("\\s").length);

	}

}
