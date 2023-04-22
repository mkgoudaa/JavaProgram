package Test;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Remove Duplicate Character";
		
		char[] ch=str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		System.out.println(RemoveDuplicate(str));
		
	}
	public static String RemoveDuplicate(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();

	}
	
}
