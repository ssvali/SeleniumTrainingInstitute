package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		WebElement element = driver.findElement(By.id("selenium_commands"));
		
		Select select  = new Select(element);
		select.selectByIndex(0);
		select.selectByValue("Switch Commands");
		select.selectByVisibleText("Navigation Commands");
	}

}
