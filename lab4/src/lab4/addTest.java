package lab4;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	public void testPositive() {
		myJUnitProg1 junit = new myJUnitProg1();
		int result = junit.addNumber(100, 200);
		assertEquals(300, result);
		}
	
	@Test
	public void testNegative() {
		myJUnitProg1 junit = new myJUnitProg1();
		int result = junit.addNumber(100, 200);
		assertNotEquals(500,result);
	}

}
