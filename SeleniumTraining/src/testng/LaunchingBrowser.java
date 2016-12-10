package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchingBrowser {

	/**
	 * @param args
	 */
	
	WebDriver driver;
	
	
	
	public void lauchFB(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("");
	
	}
	
	public void loginFB(){
		
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("abc");
	}

}
