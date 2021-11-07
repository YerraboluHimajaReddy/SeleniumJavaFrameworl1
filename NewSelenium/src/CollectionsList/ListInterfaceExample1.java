package CollectionsList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<String> listOfCities=new ArrayList<>();
		
		// 1st way 
		List<String> listlinkedlist=new LinkedList<>();
		
		//2nd way
		LinkedList<String> listlinkedlist1=new LinkedList<>();
		
		
		ArrayList<String> listOfCities1 = new ArrayList<>();
		// Add elements
		listOfCities1.add("Bangalore");
		listOfCities1.add("Hyderabad");
		listOfCities1.add("Chennai");
		listOfCities1.add("Kerala");
		listOfCities1.add("Chennai");
		listOfCities1.add("");
		
		listlinkedlist1.addAll(listOfCities1);
		listlinkedlist1.add("Chennai");
		System.out.println("Linked List: " + listlinkedlist1);
		listlinkedlist1.remove(1);
		System.out.println("Linked List: " + listlinkedlist1);
		
		//output
		//Linked List: [Bangalore, Hyderabad, Chennai, Kerala, Chennai, , Chennai]
		//Linked List: [Bangalore, Chennai, Kerala, Chennai, , Chennai]
		
		System.out.println("=======================");

		System.out.println("ArrayList: " + listOfCities1);
		System.out.println("ArrayList: " + listOfCities1.get(1));

		// output:
		// ArrayList: [Bangalore, Hyderabad, Chennai, Kerala]
		// ArrayList: Hyderabad
		// ArrayList: [Bangalore, Hyderabad, Chennai, Kerala, Chennai]
		// ArrayList: [Bangalore, Hyderabad, Chennai, Kerala, Chennai, ]
	}

}
