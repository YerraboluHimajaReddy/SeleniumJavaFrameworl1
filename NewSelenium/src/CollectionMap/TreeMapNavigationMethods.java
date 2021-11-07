package CollectionMap;

import java.util.TreeMap;

public class TreeMapNavigationMethods {

	public static void main(String[] args) {
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("First", 1);
		numbers.put("Second", 2);
		numbers.put("Third", 3);
		System.out.println("TreeMap: " + numbers);// TreeMap: {First=1, Second=2, Third=3}

		// Using the firstKey() method
		String firstKey = numbers.firstKey();
		System.out.println("First Key: " + firstKey); // First Key: First

		// Using the lastKey() method
		String lastKey = numbers.lastKey();
		System.out.println("Last Key: " + lastKey);//Last Key: Third

		// Using firstEntry() method
		 System.out.println("First Entry: " + numbers.firstEntry());//First Entry: First=1
		
		
		 // Using the lastEntry() method
		System.out.println("Last Entry: " + numbers.lastEntry());//Last Entry: Third=3
	}

}
