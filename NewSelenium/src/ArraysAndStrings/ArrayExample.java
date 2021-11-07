







package ArraysAndStrings;

import java.lang.reflect.Array;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		int a =10;
		// TODO Auto-generated method stub

		// Array is a collection of homogeneous(similar) elements/datatype values
		// we cannot change the size of an array means you cannot add new array rlrmrnt
		// in an arry. ie.e., array size should be fixed
		// once u fix the array size you cannot change the array size.
		// Array should start from end and end woth length -1 ; Ex: 5 elememts means 0,1,2,3,4 like this

		System.out.println("Array Example");
   
		Integer[] array= new Integer[5];
		// 1st way of initalizing the array

		int[] newArray = new int[5];

		newArray[0] = 2;
		newArray[1] = 10;
		newArray[2] = 20;
		newArray[3] = 25;
		newArray[4] = 15;

		System.out.println(" newArray[0] : " + newArray[0]);
		System.out.println(" newArray[1] : " + newArray[1]);
		System.out.println(" newArray[2] : " + newArray[2]);
		System.out.println(" newArray[3] : " + newArray[3]);
		System.out.println(" newArray[4] : " + newArray[4]);
		// System.out.println(" newArray[5]" + newArray[5]); // Error :
		// java.lang.ArrayIndexOutOfBoundsException:

		newArray[4] = 35;
		System.out.println(" newArray[4]" + newArray[4]); // newArray[4]35
		newArray[4] = newArray[3] + newArray[4];
		System.out.println(" newArray[4]" + newArray[4]); // newArray[4]60

		// i need length of array
		int arraylength = newArray.length; // length is a predefined return type
		System.out.println(" arraylength is :" + arraylength); // arraylength is :5

		int newArray1[] = new int[2];
		newArray1[0] = 10;
		newArray1[1] = 20;

		System.out.println(" newArray1[0] : " + newArray1[0]);
		System.out.println(" newArray2[1] : " + newArray1[1]);

		// 2nd way of initalizing the array
		int[] new_Array = { 1, 2, 34, 56, 78 };
		System.out.println(" new_Array[4] :" + new_Array[4]); // new_Array[4] :78

	}

}
