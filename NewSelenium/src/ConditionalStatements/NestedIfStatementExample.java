package ConditionalStatements;

public class NestedIfStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=10;
		
		if(number<1) {
			 System.out.println(" The number is :" + number);
			 
			 if(number>0) {
				 System.out.println("Number is positive");
			 }
		}

	}

	
}


//output:
//	 The number is :10
//	 Number is positive

