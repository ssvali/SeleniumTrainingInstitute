import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AutoSuggest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/autocomplete/");
		WebElement iFra = driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(iFra);
		driver.findElement(By.id("tags")).sendKeys("B");
		//System.out.println(driver.findElement(By.id("ui-id-1")).isDisplayed());
		WebElement ele = driver.findElement(By.id("ui-id-1"));
		List<WebElement> auto = ele.findElements(By.tagName("li"));
		for(WebElement e : auto)
		{
			String s = e.getText();
			System.out.println(s);
			if(s.equalsIgnoreCase("Ruby"))
			{
				e.click();
				break;
			}
		}
		
		
	}

}
