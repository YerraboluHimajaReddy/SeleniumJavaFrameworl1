package CollectionIterator;

import java.util.ArrayList;

public class ListIteratorImplementation {

	public static void main(String[] args) {

		// Creating an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("ArrayList: " + numbers);// ArrayList: [1, 3, 2]

		// Creating an instance of ListIterator
		java.util.ListIterator<Integer> iterate = numbers.listIterator();
//		iterate.next();
//		iterate.next();
//		System.out.println(iterate.next());//1

		System.out.println(iterate.next());//3
		
		// Using the previous() method
//        int number1 = iterate.previous();
//        System.out.println("Previous Element: " + number1);///1
        
        System.out.println(iterate.next());
        
        //Using the previousIndex()
        int index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1);//Position of the Previous element: 1



	}

}
