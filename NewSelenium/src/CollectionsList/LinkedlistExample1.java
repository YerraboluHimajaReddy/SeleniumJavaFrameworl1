package CollectionsList;

public class LinkedlistExample1 {

	public static void main(String[] args) {

		java.util.LinkedList<String> animals = new java.util.LinkedList<String>();

		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");

		System.out.println(" List of linked list elements :" + animals);

		// output:
		// List of linked list elements :[Lion, Tiger, Elephant]

		animals.add(1, "Monkey");
		System.out.println(" List of linked list elements :" + animals);

		// output:
		// List of linked list elements :[Lion, Monkey, Tiger, Elephant]

		animals.add("jiraffe");
		animals.add(5, "Monkey");
		System.out.println(" List of linked list elements :" + animals);

		// output:
		// List of linked list elements :[Lion, Tiger, Elephant]
		// List of linked list elements :[Lion, Monkey, Tiger, Elephant]
		// List of linked list elements :[Lion, Monkey, Tiger, Elephant, jiraffe,
		// Monkey]
	}

}
