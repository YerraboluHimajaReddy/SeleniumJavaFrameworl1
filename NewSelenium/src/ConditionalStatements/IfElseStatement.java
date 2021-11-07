package ConditionalStatements;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int number = 10;

//		if (number > 1) {
//			System.out.println(" The number is :" + number);
//
//			if (number > 0) {
//				System.out.println("Number is positive");
//			}
//		}else {
//			System.out.println(" NUmber is negative :" + number);
//		}
		
		
//		output:
//			 The number is :10
//			 Number is positive

		System.out.println("==============================");
		
		float number=10.45f;
		if (number > 1) {
			System.out.println(" The number is :" + number);

			if (number > 0) {
				System.out.println("Number is positive");
			}
		}else if(number<1) {
			System.out.println(" Number is negative :" + number);
		}
		else {
			System.out.println(" it is not a number " + number);
		}
		
		//output:
		//Number is negative :-10

	}

}
