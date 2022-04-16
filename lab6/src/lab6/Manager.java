package lab6;

public class Manager extends Employee {
	private String dept;
	
	//constructors  
	public Manager() {
		super();
		dept = "GenericDepartment";
	}
	public Manager(String name) {
		super(name);
		dept = "GenericDepartment";
	}
	public Manager(String name , double salary) {
		super(name , salary);
		dept= "GenericDepartment";
	}
	public Manager(String name , double salary , String dept) {
		super(name , salary);
		this.dept = dept;
	}
	//end constructors
	//accessors
	public String getDepartment() {
		return dept;
	}
	public String getName() {
		return super.getName();
	}
	public double getSalary() {
		return super.getSalary();
	}
	//done with accessors
	//mutators
	public void setDepartment(String dept) {
		this.dept = dept;
	}
	public void setName(String name) {
		super.setName(name);
	}
	public void setSalary(double salary) {
		super.setSalary(salary);
	}
	//mutators done
	
}
