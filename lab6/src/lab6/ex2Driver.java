package lab6;

public class ex2Driver {

	public static void main(String[] args) {
		Employee Ram = new Employee("Ram" , 20000);
		Employee Shyam = new Employee("Shyam", 16000);
		Manager Bhim = new Manager("Bhim", 100000, "HR");
		Manager Uttam = new Manager("Uttam" , 200000, "WebD");
		System.out.println(Ram.toString());
		System.out.println(Shyam.toString());
		System.out.println(Bhim.toString());
		System.out.println(Uttam.toString());
	}

}
