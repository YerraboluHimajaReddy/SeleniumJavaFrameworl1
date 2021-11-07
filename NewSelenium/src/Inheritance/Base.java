package Inheritance;

public class Base {
	
	public int a=10;
	
	public Base() {
		System.out.println("  Super class constructor ");
	}

	public void M1() {
		System.out.println("Base Class Method M1");
	}

	public void M2() {
		System.out.println("Base Class Method M2");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

}
