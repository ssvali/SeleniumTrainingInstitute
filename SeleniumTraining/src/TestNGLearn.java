import org.testng.annotations.*;


public class TestNGLearn {
	
	@BeforeSuite
	public void BeforeSuiteMethod(){
		System.out.println("Before Suite Method");
	}
	
	@AfterSuite
	public void AfterSuiteMethod(){
		System.out.println("After Suite Method");
	}
	
	@BeforeClass
	public void BeforeClassMethod(){
		System.out.println("Before Class Method");
	}
	
	@AfterClass
	public void AfterClassMethod(){
		System.out.println("After Class Method");
	}
	
	@BeforeTest
	public void BeforeTestMethod(){
		System.out.println("Before Test Method");
	}
	
	@AfterTest
	public void AfterTestMethod(){
		System.out.println("After Test Method");
	}
	
	@Test
	public void TestMethod1(){
		System.out.println("Test Method1");
	}
	
	@Test
	public void TestMethod2(){
		System.out.println("Test Method2");
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("After Method");
	}
	
	
}
