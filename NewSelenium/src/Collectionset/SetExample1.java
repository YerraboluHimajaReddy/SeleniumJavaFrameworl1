package Collectionset;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String args[]) {

		Set<Integer> setdata = new HashSet<>();

		setdata.add(2);
		setdata.add(3);
		System.out.println("Set1: " + setdata);

		// Output:
		// Set1: [2, 3]

		// Creating another set using the HashSet class
		Set<Integer> set2 = new HashSet<>();

		// Add elements
		set2.add(1);
		set2.add(2);
		System.out.println("Set2: " + set2);

		// output:
		// Set2: [1, 2]
		
		set2.retainAll(setdata);
		System.out.println("Intersection is: " + set2); // INtersection is: 2, 3]

		setdata.retainAll(set2);
		System.out.println("Intersection is: " + setdata);

		// Union of two sets
		set2.addAll(setdata);
		System.out.println("Union is: " + set2); // Union is: [1, 2, 3]

		// Intersection of two sets
		set2.retainAll(setdata);
		System.out.println("Intersection is: " + set2); // INtersection is: 2, 3]

		setdata.retainAll(set2);
		System.out.println("Intersection is: " + setdata);

	}

}
