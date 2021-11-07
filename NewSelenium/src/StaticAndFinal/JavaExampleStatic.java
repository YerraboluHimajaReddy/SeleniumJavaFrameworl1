package StaticAndFinal;

public class JavaExampleStatic {
	
	static class new1{
		
	}

	// Static integer variable
	static int var1 = 77;
	// non-static string variable
	String var2;

	public static void main(String args[]) {
		JavaExampleStatic ob1 = new JavaExampleStatic();
		JavaExampleStatic ob2 = new JavaExampleStatic();
		/*
		 * JavaExampleStatic static variables can be accessed directly without any
		 * instances. Just to demonstrate that static variables are shared, I am
		 * accessing them using objects so that we can check that the changes made to
		 * static variables by one object, reflects when we access them using other
		 * objects
		 */

		System.out.println(var1);
		System.out.println(ob1.var2);

		// output:
		// 77
		// null
		// Assigning the value to static variable using object ob1
		ob1.var1 = 88;
		ob1.var2 = "I'm Object1";

		System.out.println(var1);
		System.out.println(ob1.var2);

		// output:
		// 77
		// null
		// 88
		// I'm Object1

		/*
		 * This will overwrite the value of var1 because var1 has a single copy shared
		 * among both the objects.
		 */
		ob2.var1 = 99;
		ob2.var2 = "I'm Object2";
		
		System.out.println("ob1 integer:"+ob1.var1);
		System.out.println("ob1 String:"+ob1.var2);
		System.out.println("ob2 integer:"+ob2.var1);
		System.out.println("ob2 STring:"+ob2.var2);
		
//		output:
//			77
//			null
//			88
//			I'm Object1
//			ob1 integer:99
//			ob1 String:I'm Object1
//			ob2 integer:99
//			ob2 STring:I'm Object2


	}

}
