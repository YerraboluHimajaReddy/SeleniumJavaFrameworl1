package ArraysAndStrings;

public class StringFirstExample {
	
	public static void main(String[] args) {
		
		StringFirstExample SFE=new StringFirstExample();
		
		// TODO Auto-generated method stub
		
		//creating a string by java string literal 
		String name="Himaja reddy";
		char ch[]= {'h','e','l','l','o'};
		
		String s="";
		System.out.println(s);//""
		
		// array will consider null but it will not return the null value and it will show ArrayINdexOutOfBoundExcepion if the value is null
		int[] array= {1,2,3,4,5,6,7};
		System.out.println(array[4]);//5
		//System.out.println(array[8]);
		
		//creating another java string str3 by using new keyword 
		String characterarray=new String(ch);
		
		//creating another java string str3 by using new keyword 
		String str3 = new String("Java String Example"); 
		String str4 = new String("Java String Example"); 
		String str5 = new String("Java String");
		
		String str6= new String("Java STRING");
		
		StringBuffer strHimaja=new StringBuffer(str3);
		//strHimaja.append(str3);
		System.out.println(strHimaja.reverse());//elpmaxE gnirtS avaJ

		
		//Displaying all the three strings
		System.out.println(name);  
		System.out.println(characterarray);  
		System.out.println(str3);  
		
		System.out.println(str3.charAt(6)); //t
		System.out.println(str3.equals(str4)); //true
		System.out.println(str3.equals(str5)); //false
		System.out.println(str5.equals(str6)); //false
		System.out.println(str5.equalsIgnoreCase(str6)); // true
		
		
		
		System.out.println(str3.compareTo(str4)); // 0 means true
		System.out.println(str3.compareTo(str5)); // 8 or any number means false
		System.out.println(str6.compareTo(str5)); //-32 means both strings are not same
		System.out.println(str6.compareToIgnoreCase(str5)); //0
		
		
		System.out.println(str3.startsWith("Java"));//true
		System.out.println(str3.startsWith("ava"));//false
		
		System.out.println(str3.endsWith("ple"));//true
		
		System.out.println(str3.indexOf("E")); //12
		System.out.println(str3.lastIndexOf("a"));//14
		
		System.out.println(str3.length()); // 19
		
		System.out.println(str6.toLowerCase());//java string
		System.out.println(str6.toUpperCase());//JAVA STRING
		
		 String fullName="Himaja@reddy123";
		 System.out.println(fullName);//Himaja@reddy123
		 


		
	}

}
