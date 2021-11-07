package AccessModifiers;

public class PrivateClass1 {
	
	int b=20;
	
	private int a =10;
	private void add() {
		System.out.println(" Add method ");
	}
	
	public static  void add1() {
		System.out.println(" Add1 method ");
	}
	
	public static void main(String args[]) {
		
		PrivateClass1 p1 =new PrivateClass1();
		System.out.println(p1.a);
		p1.add();
		add1();
	}

}

//output:
//	10
//	 Add method 
