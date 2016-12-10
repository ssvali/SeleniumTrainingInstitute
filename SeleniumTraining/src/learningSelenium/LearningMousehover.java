package learningSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class LearningMousehover {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/");
		
		// Below script to mouse hover
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@name='&lpos=cricinfo_mainnav&lid=livescores']")));
		action.build().perform();
		action.click(driver.findElement(By.xpath("//a[text()='Live Scores Home']")));
		
	}

}
