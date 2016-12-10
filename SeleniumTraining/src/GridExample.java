import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class GridExample {

	/**
	 * @param args
	 * 
	 * 
	 */
	
	@Test
	public void setup(){
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		RemoteWebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://facebook.com/");
		System.out.println(driver.getTitle());
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		RemoteWebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://facebook.com/");
		System.out.println(driver.getTitle());

	}*/
	
	

}
