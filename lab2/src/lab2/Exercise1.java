package lab2;
import java.io.*;
public class Exercise1 {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sum = 0 ;
		System.out.println("Enter the 10 numbers : ");
		for( int i = 0 ; i < 10 ; i++) {
			String strtonum = br.readLine();
			sum += Integer.parseInt(strtonum);
		}
		System.out.println("The sum of the 10 numbers is : "+ sum);
	}

}
