import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitsInSeleniun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Implicit Wait -
		 * 2. Explicit Wait
		 *  */
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Explicit Wait
		
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput"))).click();
	    
	    //wait.until(ExpectedConditions.)
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
