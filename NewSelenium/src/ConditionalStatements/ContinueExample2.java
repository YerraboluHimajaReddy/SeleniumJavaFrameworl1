package ConditionalStatements;

public class ContinueExample2 {

	public static void main(String args[]) {

		int counter = 5;

		int i = 2;
		int j = 3;

		if (i == 2 && j == 3 || counter == 10) {

			System.out.println(" i value is : " + i + " j value is :" + j); // i value is : 2 j value is :3

		}

		if (i == 2 && j == 3 && counter == 10) {

			System.out.println(" i value is : " + i + " j value is :" + j); // i value is : 2 j value is :3

		}
		while (counter >= 0) {
			if (counter == 7) {
				counter--;
				continue;
			}
			System.out.print(counter + " ");
			counter--;
		}
	}

}

// output:
//i value is : 2 j value is :3
//5 4 3 2 1 0 
// 10 9 8 6 5 4 3 2 1 0