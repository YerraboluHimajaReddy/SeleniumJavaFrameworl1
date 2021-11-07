package Collectionset;

public class TailSet {

	public static void main(String[] args) {
		java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		System.out.println("TreeSet: " + numbers); // TreeSet: [2, 4, 5, 6]

		// Using headSet() with default boolean value
		System.out.println("Using headSet without boolean value: " + numbers.tailSet(5)); // Using headSet with boolean
																							// value: [5, 6, 7]

		// Using headSet() with specified boolean value
		System.out.println("Using headSet with boolean value: " + numbers.tailSet(5, true)); // Using headSet with
																								// boolean value: [5, 6,
																								// 7]

		// Using subSet() with default boolean value
		System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));// Using subSet without
																							// boolean value: [4, 5]

		System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 7));//Using subSet without boolean value: [4, 5, 6]

	}

}
