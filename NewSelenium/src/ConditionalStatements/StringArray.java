package ConditionalStatements;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringarray[]= {"Himaja","Krishna","Dhanusha","Sunil"};
		
		// String array for 
		
		for (int i = 0; i < stringarray.length; i++) {
			System.out.println(stringarray[i]);
			
		}
		
		// String array for each 
		System.out.println("====================");
		for (String string : stringarray) {
			System.out.println(string);
		}
		

	}

}

//output:
//	Himaja
//	Krishna
//	Dhanusha
//	Sunil
