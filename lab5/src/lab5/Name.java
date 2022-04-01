package lab5;
import java.util.StringTokenizer;
public class Name {
	private String fname;
	private String mname;
	private String lname;
	//provide accessor methods as per given specification 
	//provide implementation for getName() method as per given specification
	
	public String getFirstName() {
		return this.fname;
	}
	
	public String getMiddleName() {
		return this.mname;
	}
	
	public String getLastName() {
		return this.lname;
	}
	// accessor methods are now finish
	Name(String name ){
		/*Complete the constructor by extracting the vales of three name fields. Note that the name value may be ether comma or semicolon separated */
		//Write your code here
		if(name.indexOf(';')!= -1) {
			String[] tokens = name.split(";");
			lname = tokens[0];
			mname = tokens[1];
			fname = tokens[2];
		}
		if(name.indexOf(',')!=-1) {
			String[] tokens = name.split(",");
			fname = tokens[0];
			mname = tokens[1];
			lname = tokens[2];
		}
		
	}
	
	public String getName() {
		String fullname = fname + " " + mname + " " + lname ;
		return fullname;
	}
	
	public String toString() {
		return fname+ mname + lname ;
	}
}
