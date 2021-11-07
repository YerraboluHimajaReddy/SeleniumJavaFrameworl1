package Collectionset;

import java.util.HashSet;

public class RemoveElementsInAList {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("HashSet: " + numbers);

		// output:
		// HashSet: [2, 5, 6]

		// Using remove() method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + value1);
		System.out.println("HashSet: " + numbers);

		// output:
		// HashSet: [2, 5, 6]
		// Is 5 removed? true
		// HashSet: [2, 6]

		boolean value2 = numbers.removeAll(numbers);
		System.out.println("Are all elements removed? " + value2);
		System.out.println("HashSet: " + numbers);

		// output:
		// Are all elements removed? true
		// HashSet: []

	}
}
