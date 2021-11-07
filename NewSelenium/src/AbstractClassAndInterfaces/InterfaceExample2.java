package AbstractClassAndInterfaces;

interface InterfaceExample2 extends InterfaceExample1 {

	// by default public static final
	static String type = "programming language";
	final String type1 = "programming language";
	String type2 = "programming language";

	abstract void name(String name);

	abstract void age(int age);

	public void getType();

	void getVersion();

	public default void add() {
		System.out.println(" in interface default add method");
	}

	public static void add1() {
		System.out.println(" in interface static add method");
	}

	static void privateMethod() {

	}

	public static void main(String args[]) {
		//// we cannot crate object for abstract class , it will throw an error like
		// Cannot instantiate the type AbstractClassExample1
		// InterfaceExample2 ie2= new InterfaceExample2()
	}

}
