package Exceptions;

public class ExampleOfThrowKeyword {

	public static void divideByZero() {

		// throw an exceptiont
		// int s =2/0;

		try {
			throw new NullPointerException("Trying to divide by 0");
		} catch (Exception e) {
			System.out.println(" IN catch block");
		}
	}

	public static void main(String[] args) {
		divideByZero();
	}

}
