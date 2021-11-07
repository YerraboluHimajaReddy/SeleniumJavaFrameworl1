package Exceptions;

import java.io.IOException;

public class ThrowingCheckedException {

	public static void findFile() throws IOException {
		throw new IOException("File not found");
	}

	public static void main(String[] args) throws IOException {
		
		//findFile();
		
		// ouput:
		/*Exception in thread "main" java.io.IOException: File not found
		at Exceptions.ThrowingCheckedException.findFile(ThrowingCheckedException.java:8)
		at Exceptions.ThrowingCheckedException.main(ThrowingCheckedException.java:13)*/

		try {
			findFile();
			System.out.println("Rest of code in try block");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

//output:
//File not found

