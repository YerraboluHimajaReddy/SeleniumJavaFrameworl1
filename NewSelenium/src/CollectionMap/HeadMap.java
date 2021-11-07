package CollectionMap;

import java.util.TreeMap;

public class HeadMap {

	public static void main(String[] args) {

		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("First", 1);
		numbers.put("Second", 2);
		numbers.put("Third", 3);
		numbers.put("Fourth", 4);
		System.out.println("TreeMap: " + numbers);

		System.out.println("\nUsing headMap() Method:");
		// Using headMap() with default booleanValue
		System.out.println("Without boolean value: " + numbers.headMap("Fourth"));

		// Using headMap() with specified booleanValue
		System.out.println("With boolean value: " + numbers.headMap("Fourth", true));

	}

}

// OUTPUT:
// TreeMap: {First=1, Fourth=4, Second=2, Third=3}
// Using headMap() Method:
// Without boolean value: {First=1}
// With boolean value: {First=1, Fourth=4}
