package Collectionset;

import java.util.HashSet;

public class DifferenceofSets {

	public static void main(String[] args) {
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet1: " + primeNumbers);

		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(1);
		oddNumbers.add(1);
		System.out.println("HashSet2: " + oddNumbers);

		// Difference between HashSet1 and HashSet2
//		primeNumbers.removeAll(oddNumbers);
//		System.out.println("Difference : " + primeNumbers); //
//		System.out.println("prime number " + primeNumbers);
//		
//		oddNumbers.removeAll(primeNumbers);
//		System.out.println("Difference : " + oddNumbers);

		// output:
		// HashSet1: [2, 3, 5]
		// HashSet2: [1, 3, 5]
		// Difference : [2]
		
		
        // Check if primeNumbers is a subset of numbers
        boolean result = oddNumbers.containsAll(primeNumbers);
        System.out.println("Is HashSet2 is subset of HashSet1? " + result);
        System.out.println("Is HashSet2 is subset of HashSet1? " + oddNumbers);

	}

}
