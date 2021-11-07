package StaticAndFinal;

public class SimpleStaticExample {
	
	// no need to initialize the object to call static methods or static variables
	
	public static String name="Himaja";
	int a =10;

	public static void add(){
		
		System.out.println(name);		
		System.out.println(" In add method ");

	}
	
	public void new1() {
		System.out.println(a);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleStaticExample sse=new SimpleStaticExample();
		
		add();
		System.out.println(name);
		sse.new1();

	}

}

//output:
// In add method 
//Himaja
