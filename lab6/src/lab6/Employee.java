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
	//Accessor methods
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	//accessors done
	//mutator methods
	public void setName(String newname) {
		name = newname;
	}
	public void setSalary(double newsalary) {
		salary = newsalary;
	}
	//mutators done
	
	//toString
	@Override
	public String toString() {
		return "[ Name =  '"+  name +"' ; Salary = "+ salary + "]";
	}
}
