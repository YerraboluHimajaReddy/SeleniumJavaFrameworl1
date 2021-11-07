package CollectionsList;

public class AccessLinkedListElements {
	
	// get() method is used to access elements in an Arraylist/Linkedlist

	public static void main(String[] args) {
		java.util.LinkedList<String> languages = new java.util.LinkedList<>();

		// add elements in the linked list
		languages.add("Python");
		languages.add("Java");
		languages.add("JavaScript");
		System.out.println("LinkedList: " + languages);

		// get the element from the linked list
		String str = languages.get(1);
		System.out.print("Element at index 1: " + str);

		// output:
		// LinkedList: [Python, Java, JavaScript]
		// Element at index 1: Java
	}

}
