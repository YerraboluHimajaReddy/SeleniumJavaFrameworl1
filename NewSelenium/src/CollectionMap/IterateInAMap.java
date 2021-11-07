package CollectionMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class IterateInAMap {

	public static void main(String[] args) {

		// create a HashMap
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap: " + languages);

		// iterate through keys only
		System.out.print("Keys: ");
		for (Integer key : languages.keySet()) {
			System.out.print(key);
			System.out.println(", ");
		}

		// iterate through values only
		System.out.print("Values: ");
		for (String value : languages.values()) {
			System.out.print(value);
			System.out.println(", ");
		}

		// iterate through key/value entries
		System.out.print("\nEntries: ");
		for (Entry<Integer, String> entry : languages.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}

	}

}

// output:
// HashMap: {1=Java, 2=Python, 3=JavaScript}
// Keys: 1, 2, 3, Values: Java, Python, JavaScript,
// Entries: 1=Java, 2=Python, 3=JavaScript,