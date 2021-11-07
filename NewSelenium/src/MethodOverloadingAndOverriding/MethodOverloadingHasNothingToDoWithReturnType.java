package MethodOverloadingAndOverriding;

public class MethodOverloadingHasNothingToDoWithReturnType {

	int add(int a) {

		int b = 10;
		int c = a + b;

		System.out.println(c);
		return c;

	}

	double add(double a) {

		int b = 10;
		double c = a + b;

		System.out.println(c);
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingHasNothingToDoWithReturnType ms=new MethodOverloadingHasNothingToDoWithReturnType()
;
		ms.add(56);//66
		ms.add(45.456);//55.456
	}

}
