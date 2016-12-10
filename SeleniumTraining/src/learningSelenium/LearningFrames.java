package learningSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class LearningFrames {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://hdfcbank.com/");
		
		driver.findElement(By.xpath(".//*[@id='hometab1']/div[1]/div[3]/ul/li[7]/a")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='cee_closeBtn']")).click();
		
		driver.switchTo().frame("ceeboxiframe");
		Select select = new Select(driver.findElement(By.xpath("//*[@id='mymenu']")));
		select.selectByValue("Bangalore");
		
		
		
		
		
		
		
	}

}
