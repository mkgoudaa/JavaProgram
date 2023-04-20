package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 1, 3));
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

// delete al elements of arraylist
		numbers.clear();

// add element from set to arraylist
		numbers.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + numbers);
	}

}
