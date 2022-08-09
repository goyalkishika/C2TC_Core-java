package www.acharya.junit;

import java.util.logging.Loggger;

@TestInstance(Lifecycle.PER_CLASS)
interface TestLifecycleLogger
{
	@BeforeAll
	default void beforeAllTests()
	{
		System.out.println("Before all tests");
	}
	@AfterAll
	default void afterAllTests()
	{
		System.out.println("After all tests");
	}
	@Test
	default void testMethod() {
		System.out.println("this is test method...");
	}
}

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class HelloWorldTest implements TestLifecycleLogger
{
@Test
@RepeatedTest(10)
void test() {
	System.out.println("First Test Case");
}

}
