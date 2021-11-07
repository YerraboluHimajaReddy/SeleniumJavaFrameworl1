package CoreJavaBatch;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte
		byte num;

		num = 127;
		System.out.println(num); // 127

		// short
		short num1 = (short) 5466;
		System.out.println(num1); // 5466

		short num2 = (short) 54666;
		System.out.println(num2); // -10870

		short num3;

		num3 = 150;
		System.out.println(num3); // 150

		// for int
		int num4 = 150;
		System.out.println(num4); // 150

		// for long
		long longNum = -12332252626L;
		System.out.println(longNum); // -12332252626

		// for double
		double doubleNum = -4562937737.9d;
		System.out.println(doubleNum);// -4.293773795E7 : E7 is ntg but 10*10*10*10*10*10*10, short ccut 10 power 7

		// fpr float
		float floatNum = (float) 19.98;
		System.out.println(floatNum);// 19.98

		float floatNum1 = 19.98f;
		System.out.println(floatNum1); // 19.98

		// for boolean
		boolean b = false;
		System.out.println(b); // false

		boolean b1 = true;
		System.out.println(b1); // true

		// for char
		char ch = 'Z';
		System.out.println(ch); // z

		// Integer Literal
		byte byteLiteral = 100;
		short shortLiteral = 200;
		int numLiteral = 13313131;
		long longLiteral = 928389283L;

		System.out.println(byteLiteral); // 100
		System.out.println(shortLiteral); //200
		System.out.println(numLiteral); //13313131
		System.out.println(longLiteral); //928389283

	}

}

//Output:
//	127
//	5466
//	-10870
//	150
//	150
//	-12332252626
//	-4.5629377379E9
//	19.98
//	19.98
//	false
//	true
//	Z
//	100
//	200
//	13313131
//	928389283
