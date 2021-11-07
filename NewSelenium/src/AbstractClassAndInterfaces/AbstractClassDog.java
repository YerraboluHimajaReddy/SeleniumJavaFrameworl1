package AbstractClassAndInterfaces;

public class AbstractClassDog extends AbstractClassAnimal {

	AbstractClassDog() {
		super();
	}

	// provide implementation of abstract method
	@Override
	void makeSound() {
		// TODO Auto-generated method stub

		System.out.println("Animal make sound");
		System.out.println("Bark bark");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an object of Dog class
		AbstractClassDog d1 = new AbstractClassDog();

		d1.makeSound();
		d1.eat();
		d1.run();

	}

}

// output:
//Abstract Class Constructor
//Animal make sound
//Bark bark
//I can eat.
// IN stsatic run method
