package CollectionsList;

import java.util.ArrayList;

public class IterationInArrayList {

	public static void main(String[] args) {

		// creating an array list
		ArrayList<String> animals = new ArrayList<>();
		
		
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Dog");
		System.out.println("ArrayList: " + animals);

		// iterate using for-each loop

		System.out.println("Accessing individual elements:  ");

		for (int i = 0; i < animals.size(); i++) {
			System.out.println(" Animal in a arraylist is :" + animals.get(i));

		}

		/*
		 * output: ArrayList: [Cow, Cat, Dog] Accessing individual elements: Animal in a
		 * arraylist is :Cow Animal in a arraylist is :Cat Animal in a arraylist is :Dog
		 */
		
		
		
		//for each loop
		System.out.println("==================================");
		for(String animal: animals) {
			System.out.println(" Animal in a arraylist is :" + animals);
		}
		
		/*output:==================================
				 Animal in a arraylist is :Cow
				 Animal in a arraylist is :Cat
				 Animal in a arraylist is :Dog*/

	}

}
