package learningSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLogin {

	public static void main(String[] args) {
		
		try {
			
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sha.jamdar@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("shah_jahan13");
		
		driver.findElement(By.xpath("//input[@id='u_0_d']")).click();
		
		} catch (Exception e) 
		
		{
			System.out.println("Error occurred in script"); 
		}

	}


}
