package Practice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGtesting {

	@Test
	public void name() {
		System.out.println("Name method");
	}
	
	@BeforeTest
	public void start() {
		System.out.println("Browser open");
	}
}
