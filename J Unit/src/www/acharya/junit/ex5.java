package www.acharya.junit;

import org.junit.jupiter.api.Assumptions;

public class ex5 {
	@Test
	void testOnDev() {
		System.out.println("ENV", "DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV)),AssumptionDemo::message);
	}
	private static String message () {
		return "TEST Execution Failed :: ";
	}

}
