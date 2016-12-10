import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DeekshitaDoubt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://buildonn.com/#/home");

		driver.findElement(By.partialLinkText("SIGN IN")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[9]/div/div[4]/div/div[2]/div/div[2]/div/div[1]/div[3]/div[3]/div[1]/div[1]/div/input")).sendKeys("ABC");
	}

}
