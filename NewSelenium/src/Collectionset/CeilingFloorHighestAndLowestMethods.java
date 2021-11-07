package Collectionset;

public class CeilingFloorHighestAndLowestMethods {
		
	    public static void main(String[] args) {
	    	java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(5);
	       numbers.add(4);
	        numbers.add(6);
	        System.out.println("TreeSet: " + numbers); //TreeSet: [2, 4, 5, 6]

	        // Using higher()
	        System.out.println("Using higher: " + numbers.higher(4)); //Using higher: 5

	        // Using lower()
	        System.out.println("Using lower: " + numbers.lower(4)); //Using lower: 3

	        // Using ceiling()
	        System.out.println("Using ceiling: " + numbers.ceiling(4)); //Using ceiling: 5

	        // Using floor()
	        System.out.println("Using floor: " + numbers.floor(3)); //Using floor: 3
	        
	        // Using pollFirst()
	        System.out.println("Removed First Element: " + numbers.pollFirst());
	        System.out.println("New TreeSet: " + numbers);
	        
	        //TreeSet: [2, 3, 4, 5, 6]
	        //Removed First Element: 2
	       // New TreeSet: [3, 4, 5, 6]

	        // Using pollLast()
	        System.out.println("Removed Last Element: " + numbers.pollLast());

	        System.out.println("New TreeSet: " + numbers);
	        //Removed Last Element: 6
	        //New TreeSet: [3, 4, 5]



	}

}
