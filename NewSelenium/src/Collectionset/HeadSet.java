package Collectionset;

public class HeadSet {

	public static void main(String[] args) {
		java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers); // TreeSet: [2, 4, 5, 6]

		// Using headSet() with default boolean value
		System.out.println("Using headSet without boolean value: " + numbers.headSet(5)); //Using headSet without boolean value: [2, 4]

		 // Using headSet() with specified boolean value
		 System.out.println("Using headSet with boolean value: " + numbers.headSet(5, true)); // Using headSet with boolean value: [2, 4, 5]
	}

}
