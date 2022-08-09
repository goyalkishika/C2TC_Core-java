package www.acharya.junit;

import java.util.Collection;

public class ex8 {
	@TestFactory
	Collection<DynamicTest> dynamicTests()
	{
		retuen Arrays.asList(
				dynamicTest("simple dynamic test", () -> assertTrue(true)),
				dynamicTest("My Executable Class", () -> new MyExecutable()),
				dynamicTest("Exception Executable", () -> {throw new Exception ("Exception Example"); }),
				dynamicTest("simple dynamic test-2", () -> assertTrue(true)),
				);
	}
}

class MyExecutable implements Executable {
	@Override
	public void execute() throws Throwable
	{
		System.out.println("Hello World!");
	}

}
