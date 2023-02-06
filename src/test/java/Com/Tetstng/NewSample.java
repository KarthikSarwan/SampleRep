package Com.Tetstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewSample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
    @Test(priority = 2)
    public void test123() {
    	System.out.println("Test case 2 ");
    }
    
	@Test(enabled = false)
	public void test467() {
		System.out.println("test case 1 ");
	}
	 @Test(priority = 3)
	    public void test321() {
	    	System.out.println("Test case 3");
	    }
	 @Test
	    public void test320() {
	    	System.out.println("Test case 4");
	    }
	 @Ignore
	 @Test(priority = -1)
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


