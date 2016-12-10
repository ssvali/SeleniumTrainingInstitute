import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;


public class SSL_Ceritificate_FF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			What is SSL Certificate
			SSL (Secure Sockets Layer) is a standard security protocol for establishing a secure connection between the server and the client which is a browser.
			
		*/
		
		//Creating new Firefox profile
				WebDriver driver;
				FirefoxProfile profile = new FirefoxProfile();
				profile.setAcceptUntrustedCertificates(true); 
				profile.setAssumeUntrustedCertificateIssuer(false);
				driver = new FirefoxDriver(profile); 
				driver.manage().window().maximize();
				
				driver.get("https://cacert.org/");
				WebElement headingEle = driver.findElement(By.cssSelector(".story h3"));
				//Validate heading after accepting untrusted connection
				String expectedHeading = "Are you new to CAcert?";
				Assert.assertEquals(headingEle.getText(), expectedHeading);
				
				

	}

}
