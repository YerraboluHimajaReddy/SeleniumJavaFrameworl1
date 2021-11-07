package ConditionalStatements;

public class SwitchCaseExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int number = 4;
		//
		// switch (number) {
		//
		// case 1:
		// if (number == 1)
		// System.out.println("Number is :" + number);
		// case 2:
		// if (number == 2)
		// System.out.println("Number is :" + number);
		// case 3:
		// if (number == 5)
		// System.out.println("Number is :" + number);
		//
		// case 4:
		// if (number == 4)
		// System.out.println("Number is :" + number);
		// case 5:
		// if (number == 5)
		// System.out.println("Number is :" + number);
		//
		// default:
		// System.out.println(" It is not a number");
		// }

		String name = "Himaja";

		switch (name = "Krishna") {

		case "Himaja":

			System.out.println("name is :" + name);
			break;
		case "Krishna":
			System.out.println("name is :" + name);
			break;

		case "Dhanusha":
			System.out.println("name is :" + name);
			break;

		case "Sunil":
			System.out.println("name is :" + name);
			break;

		default:
			System.out.println(" It is not a name");
		}
	}

}


//output:
//	name is :Krishna
//	name is :Krishna
//	name is :Krishna
//	 It is not a name
