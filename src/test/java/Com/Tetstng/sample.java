package Com.Tetstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@AfterClass
	public void After() {
		System.out.println("After method ");
	}
	@AfterClass
	public void Aftercls() {
		System.out.println("After cls ");
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After suits ");
	}
}