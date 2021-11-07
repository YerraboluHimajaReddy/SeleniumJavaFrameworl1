package AbstractClassAndInterfaces;

abstract class AbstractClassExample1 {

	
	// abstract method
	abstract void method1();

	//normal method
	public void method2() {

		System.out.println(" In abstract class method2");

	}

	public static void main(String args[]) {

		// we cannot crate object for abstract class , it will throw an error like
		// Cannot instantiate the type AbstractClassExample1
		// AbstractClassExample1 ab=new AbstractClassExample1();

	}

}
