package CollectionIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers); //ArrayList: [1, 3, 2]
        
        for (int i = 0; i < numbers.size(); i++) {
			System.out.println("Numbers in a list is :" + numbers.get(i));
		}
        
           
        Iterator<Integer> iteratorlist=numbers.iterator();
        
            
        // Using the next() method
        int number = iteratorlist.next();
        System.out.println("Accessed Element: " + number);//Accessed Element: 1

        
        while (iteratorlist.hasNext()) {
        	 System.out.println("Accessed Element: " +iteratorlist.next());
			
		}
        
        // Using the remove() method
        iteratorlist.remove();
        System.out.println("Removed Element: " + number);

        System.out.println("Updated ArrayList: "+ numbers);//Updated ArrayList: [1, 3]
        
        numbers.remove(0);

        System.out.println("Updated ArrayList: "+ numbers);//Updated ArrayList: [1]


	}

}

/*output
ArrayList: [1, 3, 2]
Numbers in a list is :1
Numbers in a list is :3
Numbers in a list is :2
Accessed Element: 1
Accessed Element: 3
Accessed Element: 2
Removed Element: 1
Updated ArrayList: [1, 3]
Updated ArrayList: [3]*/
