package MethodOverloadingAndOverriding;

public class MethodOverloadingExample2 {

	public void intSquare(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}

	public void doubleSquare(double number) {
		double square = number * number;
		System.out.println("Method with double Argument Called:" + square);
	}

	public void longSquare(long number) {
		long square = number * number;
		System.out.println("Method with long Argument Called:" + square);
	}

	public void Square(double number) {
		double square = number * number;
		System.out.println("Method with double Argument Called:" + square);
	}

	public void Square(long number) {
		long square = number * number;
		System.out.println("Method with double Argument Called:" + square);
	}
	
	public void Square(long number,int num) {
		long square = number * number;
		System.out.println("Method with double Argument Called:" + square);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingExample2 mve = new MethodOverloadingExample2();
		mve.intSquare(10); // Method with Integer Argument Called:100
		mve.doubleSquare(5); // Method with double Argument Called:25.0
		mve.longSquare(8);// Method with long Argument Called:64
		mve.Square(6.0); // Method with double Argument Called:36.0
		mve.Square(6);//Method with double Argument Called:36

	}

}
