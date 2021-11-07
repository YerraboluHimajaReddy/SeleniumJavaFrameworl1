package Collectionset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String args[]) {

		HashSet<Integer> evenNumber = new HashSet<>();

		// Using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet: " + evenNumber); //HashSet: [2, 4, 6]

		HashSet<Integer> numbers = new HashSet<>();

		// Using addAll() method
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New HashSet: " + numbers); //New HashSet: [2, 4, 5, 6]
		
        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        
        //output:
        //HashSet using Iterator: 2, 4, 5, 6, 

	}

}
