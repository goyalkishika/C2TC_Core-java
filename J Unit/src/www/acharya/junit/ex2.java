package www.acharya.junit;

import org.junit.jupiter.api.Test;

public class ex2 {
	@Test
	public void simple() {
		int result = 1;
		int expected = 2;
		assertEquals(result,expected);
	}

	private void assertEquals(int result, int expected) {
		// TODO Auto-generated method stub
		
	}

}
