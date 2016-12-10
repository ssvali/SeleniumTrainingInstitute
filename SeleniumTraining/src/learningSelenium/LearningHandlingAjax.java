
package learningSelenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LearningHandlingAjax {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("selenium");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='gsr']/table/tbody/tr/td[2]/table/tbody"));
		
		List<WebElement> list = element.findElements(By.tagName("span"));
		
		System.out.println(list.size());
		
		for(int i = 1; i<=list.size(); i++){
			
			// //*[@id='gsr']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/table/tbody/tr/td[1]/span
			String xPathPart1 = "//*[@id='gsr']/table/tbody/tr/td[2]/table/tbody/tr[";
			String xPathPart2 = "]/td/div/table/tbody/tr/td[1]/span";
			String xPath = xPathPart1+i+xPathPart2;
			String Val = driver.findElement(By.xpath(xPath)).getText();
			System.out.println(Val);
			
		}
		
	}

}
