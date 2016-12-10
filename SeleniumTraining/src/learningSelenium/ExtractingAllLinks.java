package learningSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExtractingAllLinks {
	
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		for(int index=0; index<=element.size(); index++ ){
			String LinkName = element.get(index).getAttribute("text");
			System.out.println(LinkName);
		}
	}

}
