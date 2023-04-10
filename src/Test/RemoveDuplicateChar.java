package Test;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicateChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Remove Duplicate Character";
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
