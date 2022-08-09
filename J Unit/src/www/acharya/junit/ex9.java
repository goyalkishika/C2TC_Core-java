package www.acharya.junit;

import static org.junit.Asser.assertNotNull;

public class ex9 {
	@ParameterizedTest
	@ValueSource(int s = {1,2,3} )
	void withValueSource(int number)
	{
		assertNotNull(number);
	}
	private void assertNotNull(int number) {
		
		
	}
}

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(int s = {1,2,3} )
	void withValueSource(string number)
	{
		assertNotNull(number);
	}
}

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings = {"1","2","three","4","five"} )
	void withValueSource(int number)
	{
		assertNotNull(number);
	}
}

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings = {"1","2","three","4","five"} )
	void withValueSource(string number)
	{
		assertNotNull(number);
	}

}
