package StaticAndFinal;

public class JavaFinalMethod {

	// java wont allow us to override final methods, if you want you can overload
	// the methods as below
	// create a final method
	public final void display() {
		System.out.println("This is a final method.");
	}
	
//	 // create a final method
//	 public final void display() {
//	 System.out.println("This is a final method.");
//	 }

	// create a final method
	public final void display(int age) {
		System.out.println("This is a final method.");
	}

	public static void main(String[] args) {
		JavaFinalMethod obj = new JavaFinalMethod();
		obj.display();

		// output:
		// This is a final method.
	}

}
