package CoreJavaBatch;

public class InstanceVariable {

	String myInstanceVar = "instance variable";

	public static void main(String args[]) {

		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		InstanceVariable obj3 = new InstanceVariable();

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

		obj2.myInstanceVar = "Changed Text";

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
	}

}

//OUTPUT:
//	instance variable
//	instance variable
//	instance variable
//	instance variable
//	Changed Text
//	instance variable
