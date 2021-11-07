package Collectionset;

import java.util.Iterator;

public class TreesetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.TreeSet<Integer> numbers = new java.util.TreeSet<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);

		// Calling iterator() method
		Iterator<Integer> iterate = numbers.iterator();
		System.out.print("TreeSet using Iterator: ");
		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}

		// Using the remove() method
		boolean value1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + value1);


		// output:
		// TreeSet: [2, 5, 6]
		// TreeSet using Iterator: 2, 5, 6, Is 5 removed? true
		// TreeSet: [2, 6]
		
        // Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);
        //First Number: 2
        
        // Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
        //Last Number: 6

        
		// Using the removeAll() method
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
        System.out.println("TreeSet: " + numbers);
        
        //TreeSet: []




	}

}

// output:
// TreeSet: [2, 5, 6]
// TreeSet using Iterator: 2, 5, 6,
