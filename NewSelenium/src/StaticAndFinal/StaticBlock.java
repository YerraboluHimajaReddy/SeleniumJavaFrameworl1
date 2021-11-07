package StaticAndFinal;

public class StaticBlock {

	
	 static int a;
	 static String name;
	 
	 static {
		 a=10;
	 }
	 
	 static {
		 name="Himaja";
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(name);
		System.out.println(a);
		
		

	}

}
