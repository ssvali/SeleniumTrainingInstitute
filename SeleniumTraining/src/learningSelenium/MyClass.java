package learningSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
/*		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		
//		driver.get("http://www.google.com"); // To launch the AUT URL
		driver.navigate().to("http://www.google.com"); // To Launch the AUT URL
		
		WebElement element = driver.findElement(By.xpath("//*[@id='gs_htif0']"));
		element.sendKeys("Selenium");
		element.click();
		
	}

}
