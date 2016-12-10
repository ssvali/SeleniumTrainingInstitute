package testng;
import junit.framework.Assert;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testng.LaunchingBrowser;


public class TestNGLearning {
	
	LaunchingBrowser LB = new LaunchingBrowser();
	
	@BeforeSuite
	public void BeforeSuitemethod(){
		System.out.println("Before Suite executed");
	}
	
	@AfterSuite
	public void AfterSuiteMethod(){
		System.out.println("After Suite executed");
	}
	
	@BeforeTest
	public void BeforeTestMethod(){
		System.out.println("BeforeTestMethod executed");
	}
	
	@AfterTest
	public void AfterTestMethod(){
		System.out.println("After TestMethod executed");
	}
	

	@Test(groups = {"Function","Regression"}, priority =1)
	public void Method1(){
		System.out.println("Method1");
	}
	
	@Test(groups = {"Function"}, priority =2)
	public void Method2(){
		System.out.println("Method2");
		Assert.fail("Wantedly failed");
	
	}
	
	@Test(groups = {"Regression"}, dependsOnMethods = "Method2")
	public void Method3(){
		System.out.println("Method3");
		Assert.fail("Wantedly failed");
	
	}
	
	@Parameters("Browser")
	@Test(groups = {"Function"}, priority =3)
	
	public void Browser(String rowser){
		System.out.println("Selected Browser is :- " + rowser);
	}
	
	
	
	
}
