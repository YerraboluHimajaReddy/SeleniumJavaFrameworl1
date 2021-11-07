package ClassAndObjects;

public class Employee {
	
	// default int value is 0
	//default string value is null

	String name;
	int age;
	String designation;
	double salary;
	
	public Employee() {
		System.out.println(" This is a normal constructor ");
	}

	// This is the constructor of the class Employee : Parameterized consructor
	public Employee(String name) {
		this.name = name;
	}

	// Assign the age of the Employee to the variable age.
	public void empAge(int empAge) {
		age = empAge;
	}

	/* Assign the designation to the variable designation. */
	public void empDesignation(String empDesig) {
		designation = empDesig;
	}

	/* Assign the salary to the variable salary. */
	public void empSalary(double empSalary) {
		salary = empSalary;
	}

	/* Print the Employee details */
	public void printEmployee() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Designation:" + designation);
		System.out.println("Salary:" + salary);
	}
	
	public static void main(String args[]) {
		
		Employee emp= new Employee("Himaja");
		emp.empAge(10);
		emp.empDesignation("Software Engineer");
		emp.empSalary(50000);
		emp.printEmployee();
		
	}

}

//output:
//	Name:Himaja
//	Age:0
//	Designation:null
//	Salary:0.0

//Name:Himaja
//Age:10
//Designation:Software Engineer
//Salary:50000.0