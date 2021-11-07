package Exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListOfNumbers {

	// create an integer array
	private int[] list = { 5, 6, 8, 9, 2 };

	// method to write data from array to a file
	public void writeList() throws IOException {
		PrintWriter out = null;

		try {
			System.out.println("Entering try statement");

			try( PrintWriter  out1= new PrintWriter(new FileWriter("OutputFile.txt"))) {
				int a = 10 / 0;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.err.println(" Nested try exception" + ex.getMessage());
			} catch (Exception ex) {
				System.err.println(" Nested try exception" + ex.getMessage());
			}

			finally {
				System.out.println(" Nested try finally");
			}

			// creating a new file OutputFile.txt
			//out = new PrintWriter(new FileWriter("OutputFile.txt"));

			// writing values from list array to Output.txt
			for (int i = 0; i <= list.length; i++) {
				System.out.println("Value at: " + i + " = " + list[i]);
			}

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception => " + ex.getMessage());
		}

		catch (Exception e) {
			System.out.println("Exception => " + e.getMessage());
		}

		finally {
			// checking if PrintWriter has been opened
			if (out != null) {
				System.out.println("Closing PrintWriter");
				// close PrintWriter
				out.close();
			}

			else {
				System.out.println("PrintWriter not open");
			}
		}

	}

	public static void main(String[] args) throws IOException {
		ListOfNumbers list = new ListOfNumbers();
		list.writeList();
	}

}
