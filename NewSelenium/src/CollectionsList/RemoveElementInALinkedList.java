package CollectionsList;

public class RemoveElementInALinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<String> languages = new java.util.LinkedList<>();

		// add elements in LinkedList
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Kotlin");
		System.out.println("LinkedList: " + languages);

		// output:
		// LinkedList: [Java, Python, JavaScript, Kotlin]
		languages.remove();
		System.out.println("LinkedList: " + languages);
		// output:
		// LinkedList: [Java, Python, JavaScript, Kotlin]
		// LinkedList: [Python, JavaScript, Kotlin]

		languages.remove(0);
		System.out.println("LinkedList: " + languages);

		// output:
		// LinkedList: [Java, Python, JavaScript, Kotlin]
		// LinkedList: [Python, JavaScript, Kotlin]
		// LinkedList: [Python, JavaScript]
		
		System.out.println(languages.contains("JavaScript")); // true
		languages.addFirst("Himaja");
		System.out.println("LinkedList: " + languages); //LinkedList: [Himaja, JavaScript, Kotlin]
		
		System.out.println(languages.peek());
		System.out.println("LinkedList: " + languages); // LinkedList: [Himaja, JavaScript, Kotlin]
		
		System.out.println(languages.poll());
		System.out.println("LinkedList: " + languages);  // LinkedList: [JavaScript, Kotlin]


	}

}
