package learningSelenium;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SeleniumCapabilities {

	/*
	 * Description:
	 * @param:
	 * @throws:
	 * @return:
	 * @author: Shashavali
	 * 
	 */
	public static void main(String[] args) {

		Proxy p = new Proxy();
		
		p.setProxyAutoconfigUrl("http://wpad/wpad.dat");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setJavascriptEnabled(true);
		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		cap.setCapability(CapabilityType.PROXY, p);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		FirefoxDriver driver = new FirefoxDriver(cap);
		
		
		cap.setCapability(CapabilityType.BROWSER_NAME, "chorme");
		
		
		driver.close(); // Close the current / active window
		driver.quit(); // Close all the windows which is open by selenium
		
		
	}

}
