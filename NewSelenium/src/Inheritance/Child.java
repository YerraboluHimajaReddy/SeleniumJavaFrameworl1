package Inheritance;

public class Child extends Parent {
	public void M2() {
		System.out.println("Child Class Method");
	}

	public static void main(String[] args) {

		// it is used to create parent class object
		//Parent p = new Child();

		// it is alos used to create parent class object
		Parent p1 = new Parent();

		// it is used to create child class object
		Child c = new Child();
		//p.M1();

		// creating object for child child too access pranet class methods
		// 1 st way
		//Child c1 = (Child) new Parent();

		// 2nd way
		Child parent = new Child();
		//c1.M1();
		//c1.M2();
		parent.M1();
		parent.M2();

	}
}


//output:
//	Parent Class Method
//	Child Class Method