import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("html/body/div[1]/section/div/div/div/p/span"));
		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();
		act.build().perform();
		driver.findElement(By.xpath("html/body/ul/li[2]")).click();
		driver.quit();
		

	}

}
