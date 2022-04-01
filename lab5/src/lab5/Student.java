package lab5;

public class Student {
	private Name name; // name of student
	private int age;// age of student
	/* Complete the Student class by adding proper constructor,accessor methods and
	by adding any other method whichare required as per specification */
	// Write Your Code From Here
	public Name getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String toString() {
		return this.name.toString() + this.age ;
	}
}
