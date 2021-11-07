package Exceptions;

public class TryAndFinallyBlockExample {

	public static void main(String[] args) {
//		try {
//			int divideByZero = 5 / 0;
//		}
//
//		finally {
//			System.out.println("Finally block is always executed");
//		}
		
		// we cannot handle only try block it will throw an compile time exception
		// try must need either clock block or finally block
		
		//1st way
		try {
			int divideByZero = 5 / 2;
		}

		finally {
			System.out.println("Finally block is always executed");
		}
		
		//output:
		//Finally block is always executed
		
		//2nd way
		try {
			int divideByZero = 5 / 0;
		}

		catch(Exception ex) {
			System.out.println("exception "+ex.getMessage());
		}
		//output:
		//exception / by zero
	}

}

// output:
//Exception in thread "main" java.lang.ArithmeticException: / by zero at Exceptions.TryAndFinallyBlockExample.main(TryAndFinallyBlockExample.java:7)
//Finally block is always executed
