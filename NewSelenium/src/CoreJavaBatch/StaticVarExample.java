package CoreJavaBatch;

public class StaticVarExample {

	public static String myClassVar = "class or static variable";

	public static String myClass = "Himaja";

	public void add() {

		String name = StaticVarExample.myClass;
		System.out.println(name);

		// Conversion from String to interger
		int a = Integer.parseInt(name);
		System.out.println(a);

		// conversion from integer to String
		String firstname = Integer.toString(a);
		System.out.println(firstname);

	}

	public static void main(String args[]) {
		
		System.out.println(StaticVarExample.myClassVar);
		System.out.println(StaticVarExample.myClassVar);
		System.out.println(StaticVarExample.myClassVar);
		
//		StaticVarExample obj = new StaticVarExample();
//		StaticVarExample obj2 = new StaticVarExample();
//		StaticVarExample obj3 = new StaticVarExample();
//
//		// obj.add();
//
//		// All three will display "class or static variable"
//		System.out.println(obj.myClassVar);
//		System.out.println(obj2.myClassVar);
//		System.out.println(obj3.myClassVar);

		// changing the value of static variable using obj2
//		obj2.myClassVar = "Changed Text";
//
//		// All three will display "Changed Text"
//		System.out.println(obj.myClassVar);
//		System.out.println(obj2.myClassVar);
//		System.out.println(obj3.myClassVar);
//
//		obj2.myClass = "Team";
//
//		// All three will display "TEam"
//		System.out.println(obj.myClass);
//		System.out.println(obj2.myClass);
//		System.out.println(obj3.myClass);
		
		// changing the value of static variable using obj2
		StaticVarExample.myClassVar = "Changed Text";

		// All three will display "Changed Text"
		System.out.println(StaticVarExample.myClassVar);
		System.out.println(StaticVarExample.myClassVar);
		System.out.println(StaticVarExample.myClassVar);

		StaticVarExample.myClass = "Team";

		// All three will display "TEam"
		System.out.println(StaticVarExample.myClass);
		System.out.println(StaticVarExample.myClass);
		System.out.println(StaticVarExample.myClass);

	}

}

// OUTPUT:
//class or static variable
//class or static variable
//class or static variable
//Changed Text
//Changed Text
//Changed Text
//Team
//Team
//Team
