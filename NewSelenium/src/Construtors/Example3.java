package Construtors;

public class Example3 {
	
	private int var;
    public   Example3(int num)
    {
           var=num;
           System.out.println(var);
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
            Example3 myobj = new Example3(3);
            System.out.println("value of var is: "+myobj.getValue());
    }


}

// OUTPUT
// value of var is: 3
