package learningSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LearningImplicitWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	}

}
