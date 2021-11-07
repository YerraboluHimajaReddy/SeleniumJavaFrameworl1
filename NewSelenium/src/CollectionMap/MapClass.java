package CollectionMap;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mapdata = new HashMap<Integer, String>();

		mapdata.put(1, "apple");
		mapdata.put(2, "apple");
		mapdata.put(3, "Banana");
		mapdata.put(4, "Mango");

		System.out.println(" Map data is :" + mapdata);// Map data is :{1=apple, 2=apple, 3=Banana, 4=Mango}

		mapdata.put(1, "CustardApple");

		System.out.println(" Map data is :" + mapdata); // Map data is :{1=CustardApple, 2=apple, 3=Banana, 4=Mango}

		mapdata.put(5, "");

		System.out.println(" Map data is :" + mapdata); // Map data is :{1=CustardApple, 2=apple, 3=Banana, 4=Mango, 5=}

		// By using get method we accesss elements in the map
		System.err.println(mapdata.get(2));// apple

		Map<Integer, String> mapdata1 = new HashMap<Integer, String>();
		mapdata1.putAll(mapdata);

		System.out.println(" Map1 data is :" + mapdata1); // Map1 data is :{1=CustardApple, 2=apple, 3=Banana, 4=Mango,
															// 5=}

		System.out.println(mapdata.containsKey(3));// true

		// Access keys of the map
		System.out.println("Keys: " + mapdata.keySet()); // Keys: [1, 2, 3, 4, 5]

		// Access values of the map
		System.out.println("Values: " + mapdata.values()); // Values: [CustardApple, apple, Banana, Mango, ]

		// Access entries of the map
		System.out.println("Entries: " + mapdata.entrySet()); //	Entries: [1=CustardApple, 2=apple, 3=Banana, 4=Mango, 5=]
		
		mapdata.replace(3, "gvaua");

		System.out.println(" Map data is :" + mapdata); // Map data is :{1=CustardApple, 2=apple, 3=gvaua, 4=Mango, 5=}

	}

}
