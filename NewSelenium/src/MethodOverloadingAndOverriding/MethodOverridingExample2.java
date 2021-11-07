package MethodOverloadingAndOverriding;

public class MethodOverridingExample2 extends MethodOverridingExample1 {

	protected void displayInfo() {
		System.out.println("I am an MethodOverridingExample2 Class displayinfo method .");
	}

	public void superClassMethod() {
		super.displayInfo();
	}

	public static void displayInfo1() {
		System.out.println("I am an MethodOverridingExample1 Class  static displayinfo method .");
	}

	public static void main(String args[]) {
		MethodOverridingExample2 mve2 = new MethodOverridingExample2();
		mve2.displayInfo();
		mve2.superClassMethod();

	}

}

// output:
// I am an MethodOverridingExample2 Class displayinfo method .
// I am an MethodOverridingExample1 Class displayinfo method .
