package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// Creating list using the ArrayList class
		List<Integer> numbers = new ArrayList<>();
		
		int[] arrayint =new int[4];
		
		

		// Add elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List: " + numbers); // List: [1, 2, 3]

		// Access element from the list
		// 1st way
		System.out.println("Accessed Element: " + numbers.get(2)); // Accessed Element: 3

		// 2nd way
		int number = numbers.get(2);
		System.out.println("Accessed Element: " + number); // Accessed Element: 3
		
        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("List: " + numbers);

        
        //output:
        //Removed Element: 2
        //List: [1, 3]
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // we cannot use primitive data types in collections, we have to use wrapper classess only
        //ArrayList<int> arrayList = new ArrayList<>();

	}

}
