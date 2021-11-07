package ArraysAndStrings;

public class StringsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Himaja";
		// System.out.println(name);
		name = "Krishna";
		System.out.println(name);

		// String literal: it will create same memory reference for diff objects which is having same data
		String str1 = "Welcome";
		String str2 = "Welcome";

		System.out.println(str1);
		// System.out.println(str2);
		str2 = "WelcomeToJava";
		System.out.println(str2);

		// String new keyword: it will create different memory reference for diff objects which is having same data

		String str3 = new String("Welcome");
		String str4 = new String("Welcome");
		String str5 = new String("Welcome");

		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}

//Output:
//	Krishna
//	Welcome
//	WelcomeToJava
//	Welcome
//	Welcome
//	Welcome
