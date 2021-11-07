package CoreJavaBatch;

public class StaticVariable {
	
	static int a =10;
		
	public static int add() {
		
		int a =10;
		int b=10;
		int c;

		System.out.println(c=a+b);
		return a+b;
	}
	
	public void add1() {
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		add();
		StaticVariable s= new StaticVariable();
		
		
		
		
		s.add1();
		

	}

}
