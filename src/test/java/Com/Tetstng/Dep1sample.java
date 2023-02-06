package Com.Tetstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dep1sample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
    @Test
    public void test123() {
    	System.out.println("Test case 2 ");
    }
    
	@Test
	public void test4() {
		System.out.println("test case 1u ");
	}
	 @Test
	    public void test3() {
	    	System.out.println("Test case hy3");
	    }
	 @Test
	    public void test20() {
	    	System.out.println("Test case 4");
	    }
	 @Ignore
	 @Test
	    public void test326() {
	    	System.out.println("Test case 5");
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

