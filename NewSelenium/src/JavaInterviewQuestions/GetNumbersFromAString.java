package JavaInterviewQuestions;

import java.util.Scanner;

public class GetNumbersFromAString {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		String inputString;

		// 2
		System.out.println("Enter a string :");
		inputString = sc.nextLine();

		// 3
		System.out.println("Following integers are found in the string : ");

		// 4
	                 	for (char ch : inputString.toCharArray()) {
			// 5
	             		if (Character.isDigit(ch)) {
				System.out.print(ch + " ");
			}
		}

		System.out.println("=========================");

		System.out.println("Following alphabets are found in the string : ");

		for (char ch : inputString.toCharArray()) {

			if (Character.isAlphabetic(ch)) {
				System.out.print(ch + " ");
			}
		}

	}

}

// OUTPUT:
// Enter a string :
// 1 37`45634`7kjhsfkashVfb9873589759
// Following integers are found in the string :
// 1 3 7 4 5 6 3 4 7 9 8 7 3 5 8 9 7 5 9 =========================
// Following alphabets are found in the string :
// k j h s f k a s h V f b