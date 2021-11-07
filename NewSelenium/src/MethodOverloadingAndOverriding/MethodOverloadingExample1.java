package MethodOverloadingAndOverriding;

public class MethodOverloadingExample1 {

	public void add() {

		System.out.println(" I am in Add method");
	}

	public void add(int a) {

		System.out.println(" I am in Add  method single parameter");

		int b = 10;
		int c = a *a;
		System.out.println(" C value is : " + c);
	}

	public void add(int a, int b) {

		System.out.println(" I am in Add method multiple parameter");
		int c = a + b;
		System.out.println(" C value is : " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingExample1 mve=new MethodOverloadingExample1();
		mve.add();
		mve.add(10);
		mve.add(25,35);

	}

}
