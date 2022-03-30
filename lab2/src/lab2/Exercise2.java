package lab2;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 10 numbers :");
		int sum = 0 ;
		for(int i = 0 , tempnum; i < 10 ; i++) {
			System.out.println("Enter the "+ (i+1) +"th Number");
			tempnum = in.nextInt();
			sum +=tempnum;
			System.out.println("You entered " + tempnum);
		}
		System.out.println("The sum is "+ sum);
	}

}
