package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetStringFromSetOfStrings {

	public static void main(String[] args) {

		System.out.println(" ========== ");

		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();

		int count = 0;

		list.add("9703422568");
		list.add("9703422568");
		list.add("9642872879");

		System.out.println(" list size : " + list.size());

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equalsIgnoreCase("9703422568")) {
				count++;
			}
		}
		System.out.println(" list size : " + list.size());

		System.out.println(" number of times the particular number is displayed in a list is :" + count);

		// 2nd way

		Scanner sc = new Scanner(System.in);
		String number1 = sc.next();

		Scanner sc2 = new Scanner(System.in);
		String number2 = sc2.next();

		Scanner sc3 = new Scanner(System.in);
		String number3 = sc3.next();
		
		System.out.println("enter numbers");
		

		list1.add(number1);
		list1.add(number2);
		list1.add(number3);
		
		int count1 = 0;

		for (int i = 0; i < list1.size(); i++) {

			if (list1.get(i).equalsIgnoreCase("9703422568")) {
				count1++;
			}
		}
		System.out.println(" list size : " + list1.size());

		System.out.println(" number of times the particular number is displayed in a list is :" + count1);


	}

}



//OUTPUT:
//   1st Way :
//	   ========== 
//	   list size : 3
//	   list size : 3
//	   number of times the particular number is displayed in a list is :2

//	
//	2nd Way:
//		 ========== 
//		 9703422568
//		 9642872879
//		 9703422568
//		 enter numbers
//		  list size : 3
//		  number of times the particular number is displayed in a list is :2

