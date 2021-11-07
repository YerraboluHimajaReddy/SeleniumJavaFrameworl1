package ArraysAndStrings;

import java.util.Arrays;

public class ArrayInitalization2ndWay {

	public static double add(double[] value) {

		for (int i = 0; i <= value.length - 1; i++) {

			System.out.println(" double array containd data [" + i + "] : " + value[i]);

		}

		return 0;

	}

	public static void add1(double[] value) {

		for (int i = 0; i <= value.length - 1; i++) {

			System.out.println(" double array containd data [" + i + "] : " + value[i]);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] data = { 60, 1, 2, 3, 30, 40, 100, 4, 90, 80, 79, 64, 77, 69, 51, 67, 68, 79, 68, 89, 90, 67899,
				8980 };
		
		double[] data2 = { 60, 1, 2, 3, 30, 40, 100, 4, 90, 80, 79, 64, 77, 69, 51, 67, 68, 79, 68, 89, 90, 67899,
				8980,56 };
		//Arrays.com
		
		
		
		Object[] data3= { 60, 1, 2, 3, 30, 40, 100, 4, 90, 80, 79, 64, 77, 69, 51, 67, 68, 79, 68, 89, 90, 67899,
				8980 };
		
		Object[] data4 = { 60, 1, 2, 3, 30, 40, 100, 4, 90, 80, 79, 64, 77, 69, 51, 67, 68, 79, 68, 89, 90, 67899,
				8980,56 };
		
		Arrays.deepEquals(data3, data4);
		
		System.out.println(Arrays.deepEquals(data3, data4));
		
	//	System.out.println(compare(data, data2));
//		
//		System.out.println(data.equals(data2)); //false
//
//		System.out.println(data[7]);
//
//		int datalength = data.length;
//
//		System.out.println(" datalength : " + datalength);
//
//		int dataleng1th = data.length - 1;
//
//		System.out.println(" datalength1 : " + dataleng1th);
//
//		add(data);
//
//		System.out.println(data[0]);
//		System.out.println(data[22]);
		Arrays.sort(data);
		
		
		for (int i = 0; i < data.length - 1; i++) {

			System.out.println(" double array containd data [" + i + "] : " + data[i]);

			//total = total + data[i];

		}
		
		//Arrays.binarySearch(data, 2);
		//Arrays.binarySearch(data, 30);
		System.out.println(Arrays.binarySearch(data, 300));
		System.out.println(Arrays.binarySearch(data, 100));
		System.out.println(Arrays.binarySearch(data, 30));
		
		Arrays.fill(data, 1, 5, 2);
		
		for (int i = 0; i < data.length - 1; i++) {

			System.out.println(" double array containd data [" + i + "] : " + data[i]);

			//total = total + data[i];

		}
		
//		System.out.println(data[0]);
//		System.out.println(data.length);
//		Arrays.sort(data);
//		System.out.println(data[22]);
//
//		System.out.println(" ====================================== ");
//
//		System.out.println(" ====================================== ");
//
//		add(new double[] { 1, 2, 3, 4, 45, 5 });
//
//		double total = 0;
//
//		for (int i = 0; i < data.length - 1; i++) {
//
//			System.out.println(" double array containd data [" + i + "] : " + data[i]);
//
//			total = total + data[i];
//
//		}
//
//		System.out.println(" ====================================== ");
//
//		System.out.println(" total data array count :" + total);
//
//		System.out.println(" ====================================== ");
//
//		for (double d : data) {
//
//			System.out.println(" double array containd data : " + d);
//		}

	}

}

//output:
//4.0
//datalength : 23
//datalength1 : 22
//double array containd data [0] : 60.0
//double array containd data [1] : 1.0
//double array containd data [2] : 2.0
//double array containd data [3] : 3.0
//double array containd data [4] : 30.0
//double array containd data [5] : 40.0
//double array containd data [6] : 100.0
//double array containd data [7] : 4.0
//double array containd data [8] : 90.0
//double array containd data [9] : 80.0
//double array containd data [10] : 79.0
//double array containd data [11] : 64.0
//double array containd data [12] : 77.0
//double array containd data [13] : 69.0
//double array containd data [14] : 51.0
//double array containd data [15] : 67.0
//double array containd data [16] : 68.0
//double array containd data [17] : 79.0
//double array containd data [18] : 68.0
//double array containd data [19] : 89.0
//double array containd data [20] : 90.0
//double array containd data [21] : 67899.0
//double array containd data [22] : 8980.0
//60.0
//8980.0
//1.0
//23
//67899.0
//====================================== 
//====================================== 
//double array containd data [0] : 1.0
//double array containd data [1] : 2.0
//double array containd data [2] : 3.0
//double array containd data [3] : 4.0
//double array containd data [4] : 45.0
//double array containd data [5] : 5.0
//double array containd data [0] : 1.0
//double array containd data [1] : 2.0
//double array containd data [2] : 3.0
//double array containd data [3] : 4.0
//double array containd data [4] : 30.0
//double array containd data [5] : 40.0
//double array containd data [6] : 51.0
//double array containd data [7] : 60.0
//double array containd data [8] : 64.0
//double array containd data [9] : 67.0
//double array containd data [10] : 68.0
//double array containd data [11] : 68.0
//double array containd data [12] : 69.0
//double array containd data [13] : 77.0
//double array containd data [14] : 79.0
//double array containd data [15] : 79.0
//double array containd data [16] : 80.0
//double array containd data [17] : 89.0
//double array containd data [18] : 90.0
//double array containd data [19] : 90.0
//double array containd data [20] : 100.0
//double array containd data [21] : 8980.0
//====================================== 
//total data array count :10191.0
//====================================== 
//double array containd data : 1.0
//double array containd data : 2.0
//double array containd data : 3.0
//double array containd data : 4.0
//double array containd data : 30.0
//double array containd data : 40.0
//double array containd data : 51.0
//double array containd data : 60.0
//double array containd data : 64.0
//double array containd data : 67.0
//double array containd data : 68.0
//double array containd data : 68.0
//double array containd data : 69.0
//double array containd data : 77.0
//double array containd data : 79.0
//double array containd data : 79.0
//double array containd data : 80.0
//double array containd data : 89.0
//double array containd data : 90.0
//double array containd data : 90.0
//double array containd data : 100.0
//double array containd data : 8980.0
//double array containd data : 67899.0

