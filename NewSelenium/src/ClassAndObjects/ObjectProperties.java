package ClassAndObjects;

public class ObjectProperties {  
	
	
	
	 
	
	   String breed;
	   int age=3;
	   String color="white with dots";
	   
	   int ObjectProperties() {
			
			return age;
			
		}
	   
	   int ObjectProperties(int age) {
			
			return age;
			
		}
	   

	   void barking() {
		  breed="normal";
		   
		   System.out.println(" The dog is barking");
	   }

	   void hungry() {
		   
		   System.out.println(" dog is hungry");
	   }

	   void sleeping() {
		   age=6;
		   System.out.println(" dog is sleeping");
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectProperties OP=new ObjectProperties();
		OP.barking();
		OP.hungry();
		OP.sleeping();
		System.out.println(OP.age);
		System.out.println(OP.color);
		System.out.println(OP.breed);

	}

}

//output:
//	 The dog is barking
//	 dog is hungry
//	 dog is sleeping
//	3
//	white with dots
//	normal
