package CoreJavaBatch;

public class VariablesInJava {
	
	
	
	
	
	//variable name and method name should starts with small letters
	// data type is mandatory to define any variable type
	//  Declaration Ex: datatype variablename=value
	// EX: int a=10, char c='a', float f=12.55
	// initialization is ntg but creating a variable with a data type without value EX: int a;
	// declaration  : declaration is ntg but initializing a variable with a value; EX: int a =10
	//instantiiation: object is created using class name is ntg but instansiation , EX: VariablesInJava java= new VariablesInJava()
	
	
	public  void name()
	{
		int a=10;
		String sirName="Himaja";
		System.out.println(" a value is :" + a);
		System.out.println(" name is :" +sirName);
		
		int b;
		b=10;
		System.out.println(" b value is :"+ b);
		char ch = 'A';
		int number = 100;
		System.out.println(ch);
		System.out.println(number);
		
		
		
		
		
		
		
		
		
		String na_me="himaja";
		int _a=10;
		int $a=10;
		
		
		String value="10";
		System.out.println(" value is :" + value);

	}
	
	
	public  void add()
	{
		int a=10;
		int b=20; 
		int c=a+b;
		System.out.println(" c value is :" + c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariablesInJava java= new VariablesInJava();
		java.name();
		java.add();
	}

}


//Output:
//	a value is :10
//name is :Himaja
//b value is :10
//A
//100
//value is :10
//c value is :30