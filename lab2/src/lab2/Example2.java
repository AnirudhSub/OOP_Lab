package lab2;
import java.util.Scanner;
public class Example2 {
	public static void main(String args[]) {
		int num1;
		double double1;
		String numStr1 , numStr2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		num1 = in.nextInt();
		System.out.println("You entered "+ num1);
		System.out.println("Enter a double : ");
		double1 = in.nextDouble();
		System.out.println("You entered : "+ double1);
		System.out.println("Enter your firstname : ");
		numStr1 = in.next();
		System.out.println("You entered : "+ numStr1);
		System.out.println("Enter your lastname :");
		numStr2 = in.next();
		System.out.println("You entered :"+ numStr2);
		
	}
}
