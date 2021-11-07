package CollectionIterator;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers); //ArrayList: [1, 3, 2]

        // Creating an instance of ListIterator
        java.util.ListIterator<Integer> iterate = numbers.listIterator();
        
        // Using the next() method
        int number1 = iterate.next();
        System.out.println("Next Element: " + number1); //Next Element: 1
        
        // Using the nextIndex()
        int index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1); //Position of Next Element: 1
        
        // Using the hasNext() method
        System.out.println("Is there any next element? " + iterate.hasNext()); // hasNext method returns boolean values, if nextelemeent present it will return true otherwise it will return false





	}

}
