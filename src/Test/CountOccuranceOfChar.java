package Test;
import java.util.HashMap;
import java.util.Map;
public class CountOccuranceOfChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "countoccuranceOfchar";
		Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (mapCount.containsKey(c)) {
				mapCount.put(c, mapCount.get(c) + 1);
			} else {
				mapCount.put(c, 1);
			}
		}
		System.out.println(mapCount);
	}
}
