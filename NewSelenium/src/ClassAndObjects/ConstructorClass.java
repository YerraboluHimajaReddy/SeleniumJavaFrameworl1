package ClassAndObjects;

public class ConstructorClass {

	static class Himaja {

		String name = "Puppy";
		int age = 10;

	}

	final class Himaja1 {

		String name = "Puppy";

		int age = 10;

	}

	class Himaja2 {

		String name = "Puppy";
		int age = 10;

	}

	String name = "Puppy";
	int age = 10;

	// TODO Auto-generated method stub

	public ConstructorClass(int age, String name) {
		// This constructor has one parameter, age.
		System.out.println("Passed age is :" + age);
		System.out.println("Passed Name is :" + name);
	}

	public ConstructorClass(String name) {
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :" + name);
	}

	public static void main(String[] args) {
		// Following statement would create an object myPuppy
		ConstructorClass myPuppy = new ConstructorClass("Dog1");
		ConstructorClass myPuppy1 = new ConstructorClass("Dog2");
		ConstructorClass myPuppy2 = new ConstructorClass(3, myPuppy.name);
		ConstructorClass myPuppy3 = new ConstructorClass(myPuppy.age, myPuppy.name);
		System.out.println(myPuppy.name);

	}

}

// OUTPUT:
// Passed Name is :Puppy
// Passed Name is :Puppy1
// Passed age is :3

// Passed Name is :Dog1
// Passed Name is :Dog2
// Passed age is :3
// Passed Name is :Puppy
// Puppy

// Passed Name is :Dog1
// Passed Name is :Dog2
// Passed age is :3
// Passed Name is :Puppy
// Passed age is :10
// Passed Name is :Puppy
// Puppy
