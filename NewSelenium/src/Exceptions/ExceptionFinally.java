package Exceptions;

public class ExceptionFinally {

	public static void main(String[] args) {
//		try {
//			// code that generates exception
//			int divideByZero = 5 / 0;
//			System.out.println(" IN try block");
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println("ArithmeticException => " + e.getMessage());
//		}
//
//		finally {
//			System.out.println("This is the finally block");
//		}
		
		//output
		// ArithmeticException => / by zero
		//This is the finally block
		
		
		try {
			// code that generates exception
			int divideByZero = 5 / 2;
			System.out.println(" IN try block");
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

		finally {
			System.out.println("This is the finally block");
		}
		
		// it wont allow u 2 access multiple finally blocks, but it will allow u 2 write multiple catch blocks
		
//		finally {
//			System.out.println("This is the finally block");
//		}
		
		//output:
		// IN try block
		// This is the finally block
	}

}
