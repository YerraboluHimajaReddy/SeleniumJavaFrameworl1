package AbstractClassAndInterfaces;

public abstract class AbstractClassAnimal {

	abstract void makeSound();

	public void eat() {
		System.out.println("I can eat.");
	}
	
	public static void run() {
		System.out.println(" In static run method");
	}
	
	AbstractClassAnimal(){
		System.out.println(" Abstract Class Constructor");
	}
	
	

}
