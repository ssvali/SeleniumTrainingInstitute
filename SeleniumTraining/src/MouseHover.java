import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseHover {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * 
	 * 'build()' method is used to compile all the list of actions into a single step and ready to be performed.
	 * 
	 * We need to use perform() to execute the action.
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Softwares\\chromedriver_win32\\chromedriver.exe");
		// create Google Chrome instance and maximize it
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.javaadvanceguru.com/");
			
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[2]/ul/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		//action.build().perform();
		driver.findElement(By.partialLinkText("C Lang")).click();
		Thread.sleep(4000); 
		WebElement highlight = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div/div/ul/li[2]/a"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div[2]/div/div/div/ul/li[2]/a"))));
		highlight.sendKeys(Keys.RETURN);
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+highlight.getLocation().x+")");
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");*/
		//js.executeScript("arguments[0].scrollIntoView()", highlight); 
		//highlight.click();
		
		 //js.executeScript("window.scrollTo(0,"highlight.getLocation().x+")");
	       // element.click();
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("arguments[0].scrollIntoView()", highlight); 
		highlight.click();*/
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", highlight);
	}
}
