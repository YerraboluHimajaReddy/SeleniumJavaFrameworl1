package Inheritance;

public class Derived extends Base {
	
	public Derived() {
		super();
	}
	
	public int a =20;
	public void M2() {
		System.out.println("Derived Class Method M2");
		String name="Himaja Reddy";
		System.out.println(name);
			
	}
	
	public void superme() {
		
		
		// to call parent class method in a sub class
		super.M2();
		System.out.println(super.a);
		
		
		
		// 1st way to call method in a same class
		this.M2();
		System.out.println(a);
		
		// 2nd way to call method in a same class
		M2();
		
	
	}


	public static void main(String[] args) {
//		// TODO Auto-generated method stub		
		//Base b= new Base();
		Derived der=new Derived();
		
	
		der.M1();
		der.M2();
		der.superme();
			

	}

}
