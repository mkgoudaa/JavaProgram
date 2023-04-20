package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicate {

	public static void main(String[] args) {

		findDuplicate("I love india love india");
	}

	public static void findDuplicate(String str) {

		Map<String, Integer> map = new HashMap<>();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}

		map.entrySet().stream().forEach(System.out::println);

		for (Entry<String, Integer> me : map.entrySet()) {
			System.out.println("Key : " + me.getKey());
			System.out.println("Value : " + me.getValue());
		}

		for (String key : map.keySet()) {

			System.out.println("Map iteration by using keyset :" + map.get(key));

		}
	}
}
