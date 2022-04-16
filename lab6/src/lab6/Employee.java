package lab6;

public class Employee {
	private String name;
	private double salary;
	
	//Constructors
	public Employee() {
		name = "GenericName";
		salary = 10000;
	}
	public Employee(String name) {
		this.name = name;
		salary = 10000;
	}
	public Employee(String name , double salary) {
		this.name = name;
		this.salary = salary;
	}
	//Constructors done
	
}
