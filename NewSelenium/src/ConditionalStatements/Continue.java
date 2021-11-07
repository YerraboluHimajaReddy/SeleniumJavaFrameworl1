package ConditionalStatements;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (int i = 0; i < 10; i++) {
		//
		// System.out.println(" The number is :" + i);
		//
		// }

		// output:
		// The number is :0
		// The number is :1
		// The number is :2
		// The number is :3
		// The number is :4
		// The number is :5
		// The number is :6
		// The number is :7
		// The number is :8
		// The number is :9

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue;
			}

			System.out.println(" The number is :" + i);

		}
		
//		output:
//		 The number is :0
//		 The number is :1
//		 The number is :2
//		 The number is :3
//		 The number is :4
//		 The number is :6
//		 The number is :7
//		 The number is :8
//		 The number is :9
	}

}
