package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableReadValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.findElement(By.linkText("Full scorecard")).click();
		

	}

}
