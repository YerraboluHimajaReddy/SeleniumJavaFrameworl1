
package ConditionalStatements;

public class BreakExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		while (num <= 100) {
			// System.out.println("Value of variable is: " + num);
			if (num == 2) {
				break;
			}

			System.out.println("Value of variable is: " + num);
			num++;
		}
		System.out.println("Out of while-loop");

	}

}
