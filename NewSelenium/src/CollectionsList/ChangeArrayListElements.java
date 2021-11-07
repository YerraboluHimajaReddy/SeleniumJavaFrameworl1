package CollectionsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChangeArrayListElements {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();

		// add elements in the array list
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("C++");
		System.out.println("ArrayList: " + languages);
		System.out.println(languages.size()); // 3

		// output:
		// ArrayList: [Java, Kotlin, C++]

		languages.set(0, "Selenium with java");
		System.out.println("ArrayList: " + languages);

		// output:
		// ArrayList: [Selenium with java, Kotlin, C++]

		// to remove elements in an arraylist
		languages.remove(2);
		System.out.println("ArrayList: " + languages);

		// output:
		// ArrayList: [Selenium with java, Kotlin]

		System.out.println(languages.size()); // 2

		// sorting the list
		Collections.sort(languages);
		System.out.println("ArrayList: " + languages);

		// output:
		// ArrayList: [Kotlin, Selenium with java]

		// 1st way to cloning
		System.out.println(languages.clone());

		// 2nd way to cloning
		System.out.println("====================================");
		ArrayList<String> languages1 = new ArrayList<>();
		languages1 = (ArrayList<String>) languages.clone();
		System.out.println(languages1);

		// is Empty
		System.out.println(languages.isEmpty()); // false
		ArrayList<String> languages2 = new ArrayList<>();
		System.out.println(languages2.isEmpty()); // true

	}

}
