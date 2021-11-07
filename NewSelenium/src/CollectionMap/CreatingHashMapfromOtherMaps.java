package CollectionMap;

import java.util.HashMap;
import java.util.TreeMap;

public class CreatingHashMapfromOtherMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // create a treemap
	    TreeMap<String, Integer> evenNumbers = new TreeMap<>();
	    evenNumbers.put("Two", 2);
	    evenNumbers.put("Four", 4);
	    System.out.println("TreeMap: " + evenNumbers);
	    
	    HashMap<String, Integer> evenNumbers1 = new HashMap<>(evenNumbers);
	    System.out.println("HashMap: " + evenNumbers1);
	    evenNumbers1.put("Three", 3);
	    System.out.println("HashMap: " + evenNumbers1);


	}

}

//output:
//TreeMap: {Four=4, Two=2}
//HashMap: {Two=2, Four=4}
//HashMap: {Two=2, Three=3, Four=4}