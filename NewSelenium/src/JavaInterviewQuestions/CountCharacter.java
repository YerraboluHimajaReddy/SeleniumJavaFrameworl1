package JavaInterviewQuestions;

public class CountCharacter {

	public static void main(String[] args) {
		            String string = "The best of both worlds";
		            int count = 0;
	                  	int count1 = 0;

		// Counts each character except space
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string with Spaces : " + count);


		for (int i = 0; i < string.length(); i++) {
                  
			count1++;
		}

		// Displays the total number of characters present in the given string
		            System.out.println("Total number of characters in a string without Spaces : " + count1);
	}

}

// OUTPUT: 
//	 Total number of characters in a string with Spaces : 19 
//	 Total number of characters in a string without Spaces : 23

