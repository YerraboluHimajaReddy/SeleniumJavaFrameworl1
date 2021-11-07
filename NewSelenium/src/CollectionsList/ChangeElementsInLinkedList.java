package CollectionsList;

public class ChangeElementsInLinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<String> languages = new java.util.LinkedList<>();

		// add elements in the linked list
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Java");
		System.out.println("LinkedList: " + languages);
		
		//output:
		//LinkedList: [Java, Python, JavaScript, Java]
		
		languages.set(2, "C#");
		System.out.println("LinkedList: " + languages);
		
		//Output:
		//LinkedList: [Java, Python, JavaScript, Java]
		//LinkedList: [Java, Python, C#, Java]

	}

}
