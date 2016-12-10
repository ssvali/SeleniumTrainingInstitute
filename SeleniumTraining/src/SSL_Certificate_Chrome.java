import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


public class SSL_Certificate_Chrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		// To Accept SSL certificate
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// setting system property for Chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Softwares\\chromedriver_win32\\chromedriver.exe");
		// create Google Chrome instance and maximize it
		driver = new ChromeDriver(capability);
		driver.manage().window().maximize();
		
		driver.get("https://cacert.org/");
		WebElement headingEle = driver.findElement(By.cssSelector(".story h3"));
		// Validate heading after accepting untrusted connection
		String expectedHeading = "Are you new to CAcert?";
		Assert.assertEquals(headingEle.getText(), expectedHeading);
		

	}

}
