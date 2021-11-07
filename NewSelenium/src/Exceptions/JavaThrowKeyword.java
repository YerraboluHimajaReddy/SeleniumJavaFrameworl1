package Exceptions;

public class JavaThrowKeyword {

	public static void divideByZero() {
		throw new ArithmeticException("Trying to divide by 0");
	}

	public static void main(String[] args) {
		divideByZero();
	}

}

// outpuit:
// Exception in thread "main" java.lang.ArithmeticException: Trying to divide by
// 0
// at Exceptions.JavaThrowKeyword.divideByZero(JavaThrowKeyword.java:6)
// at Exceptions.JavaThrowKeyword.main(JavaThrowKeyword.java:10)
