package StaticAndFinal;

public class JavaFinalVariable {
	
	public static void main(String[] args) {

//	    // create a final variable
//	    final int AGE ;
//
//	    // try to change the final variable
//	    AGE = 45;
//	    System.out.println("Age: " + AGE); //45
		
	    // create a final variable
	    final int AGE = 32;

	    // try to change the final variable
	   //AGE = 45; // will get compile time error as we are unable to modify the final variable value	
	    System.out.println("Age: " + AGE); //32

	  }


}
