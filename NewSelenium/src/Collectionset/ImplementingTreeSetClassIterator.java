package Collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ImplementingTreeSetClassIterator {

	public static void main(String[] args) {
		// Creating a set using the TreeSet class
		Set<Integer> numbers = new TreeSet<>();

		// Add elements to the set
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		System.out.println("Set using TreeSet: " + numbers); //Set using TreeSet: [1, 2, 3]

		Set<Integer> numbers1 = new HashSet<>();

		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(1);
		System.out.println("Set using Hashset: " + numbers1); // Set using Hashset: [1, 2, 3]
		
		// Access Elements using iterator()
        System.out.println("Accessing elements using iterator(): ");

        
        Iterator<Integer> setlterator=numbers.iterator();
        while (setlterator.hasNext()) {
			System.out.println(setlterator.next());
			
		}
        
        
	}

}

//output:
//Set using TreeSet: [1, 2, 3]
//Set using Hashset: [1, 2, 3]
//Accessing elements using iterator(): 
//1
//2
//3
