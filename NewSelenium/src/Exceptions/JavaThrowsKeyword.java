package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaThrowsKeyword {

	public static void findFile() throws IOException {
		
		// code that may produce NullPointerException
	  String s=null;


		// code that may generate IOException
		File newFile = new File("C:\\Users\\Sony\\Desktop\\text.txt.txt");
		FileInputStream stream = new FileInputStream(newFile);
	}

	public static void main(String[] args) throws IOException {
		try {
			findFile();
			System.out.println(" File displayed in the folder"); //File displayed in the folder
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

// output:
//java.io.FileNotFoundException: C:\Users\Sony\Desktop\text.txt.txt (The system cannot find the file specified)

