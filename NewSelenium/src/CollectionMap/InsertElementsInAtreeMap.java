package CollectionMap;

import java.util.TreeMap;

public class InsertElementsInAtreeMap {

	public static void main(String[] args) {
		// Creating TreeMap of even numbers
		TreeMap<String, Integer> evenNumbers = new TreeMap<>();

		// Using put()
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		evenNumbers.put("Five", 6);
		// evenNumbers.put("Six", 6);
		System.out.println("TreeMap of even numbers: " + evenNumbers);

		// Using putIfAbsent()
		evenNumbers.putIfAbsent("Six", 6);
		System.out.println("TreeMap of even numbers: " + evenNumbers);

		evenNumbers.put("one", 1);
		System.out.println("TreeMap of even numbers: " + evenNumbers);

		// Creating TreeMap of numbers
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
		System.out.println("TreeMap of numbers: " + numbers);

		// Using putAll()
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers: " + numbers);
		
		// Hashmap will not allow duplicates, but treemap will allow duplicates
		
		
		// Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);
        
        boolean result = numbers.remove("one", 1);
        System.out.println("Is the entry {Three=3} removed? " + result);
        System.out.println("TreeMap of numbers: " + numbers);
        
        // Using replace()
        evenNumbers.replace("Five", 10);
        System.out.println("TreeMap of numbers: " + evenNumbers);



	}

}

// Output:
// TreeMap of even numbers: {Four=4, Two=2}
// TreeMap of even numbers: {Four=4, Six=6, Two=2}
// TreeMap of even numbers: {Four=4, Six=6, Two=2, one=1}
// TreeMap of numbers: {One=1}
//TreeMap of numbers: {Four=4, One=1, Six=6, Two=2, one=1}