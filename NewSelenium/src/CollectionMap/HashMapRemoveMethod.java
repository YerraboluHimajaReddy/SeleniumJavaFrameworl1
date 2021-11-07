package CollectionMap;

import java.util.HashMap;

public class HashMapRemoveMethod {
	public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);
    
    languages.remove(1);
    System.out.println("HashMap: " + languages);
    
    //OUtput
    //HashMap: {1=Java, 2=Python, 3=JavaScript}
   // HashMap: {2=Python, 3=JavaScript}
    
    //languages.compute(1, remappingFunction)
    
	}

}
