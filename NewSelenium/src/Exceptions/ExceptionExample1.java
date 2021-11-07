package Exceptions;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int d=0;
		int c=d/10;
		String s=null;
		String g="10";
		String m =s+g;
		try {
			System.out.println(a/0);
		}catch(NullPointerException e){
			System.out.println(" It is an Null Pointer Exception");
		}catch(ArithmeticException e){
			System.out.println(" It is an Arithmetic Pointer Exception");
		}
		catch(Exception e){
			System.out.println(" It is an  Exception");
		}
		
		

	}

}
