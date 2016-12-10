import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Handling_iFrames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
		  * 
		  * iFrame is a HTML document embedded inside an HTML document. iFrame is defined by an <iframe></iframe> tag in HTML. 
		    With this tag you can identify an iFrame while inspecting the HTML tree.	
		 
		    To Switch between iFrames we have to use the driver’s switchTo().frame command. We can use the switchTo().frame() in three ways:

			 switchTo.frame(int frameNumber): Pass the frame index and driver will switch to that frame.
			 switchTo.frame(string frameNameOrId): Pass the frame element Name or ID and driver will switch to that frame.
			 switchTo.frame(WebElement frameElement): Pass the frame web element and driver will switch to that frame.
			 driver.switchTo().defaultContent();
			 
			 *
			 */
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		//WebElement fr = driver.findElement(By.id("IF1"));
		driver.switchTo().frame("iframe1");
		driver.findElement(By.id("")).click();
		driver.switchTo().defaultContent();
		

		

	}

}
