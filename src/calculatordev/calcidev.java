package calculatordev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
class calcidev {

	@Test
	public void calTest() {
		assertEquals(31,calulatordev.add(11,20));
	}
	@Test
	public void calTestSub() {
		assertEquals(30,calulatordev.sub(50,20));
	}
	@Test
	public void calTestMul() {
		assertEquals(30,calulatordev.mul(6,5));
	}
	@Test
	public void calTestDiv() {
		assertEquals(6,calulatordev.div(30,5));
	}
	
	
	}


