package JavaInterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check");

		int x = sc.nextInt();
		int counter = 0;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				counter = 1;
				System.out.println("Entered number is not a prime number");
				break;
			}
		}
		if (counter == 0)
			System.out.println("This is a prime number");

	}

}



//OUTPUT:
//enter a number to check
//5
//5 is a prime number
//enter a number to check
//4
//4 is not a prime number