package AbstractClassAndInterfaces;

public class InterfaceClass2 implements InterfaceExample1,InterfaceExample2 {

	@Override
	public void name(String fullname) {
		// TODO Auto-generated method stub
		System.out.println("Programming Language: " + fullname);//Programming Language: Java
	}

	@Override
	public void getType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getVersion() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		InterfaceClass2 language = new InterfaceClass2();
	    language.name("Java");
	    language.getType();
	    language.getVersion();
	    language.age(56);
	  }

	@Override
	public void age(int age) {
		// TODO Auto-generated method stub
		System.out.println("age is : " + age);//age is : 56
	}

	

}
