package oop.eclipse.ide.first;

public class Bicycle {
	
	int speed = 100;
	int noOfGears = 5;
	int cadence = 40;
	
	public void printState() {
		System.out.println("Bicycle [Cadence= "+ cadence + ", noOfGears =" + noOfGears + ", speed =" + speed + "]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle b1 = new Bicycle();
		b1.printState();
	}

}
