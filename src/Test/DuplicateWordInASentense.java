package Test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordInASentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love India I live India";
		Map<String, Integer> mapCount = new HashMap<>();
		String words[] = str.split(" ");
		for (String word : words) {
			if (mapCount.containsKey(word)) {
				mapCount.put(word, mapCount.get(word) + 1);
			} else {
				mapCount.put(word, 1);
			}
		}
		System.out.println(mapCount);
	}

}
