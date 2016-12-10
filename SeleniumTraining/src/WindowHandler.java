import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandler {

	/**
	 * @param args
	 * 
	 * getWindowHandle() method return a string value and it returns the Window handle of current focused browser window. 
	 * getWindowHandles() method returns a set of all Window handles of all the browsers that were opened in the session.
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window : " + parentWindow);
		
		System.out.println("Parent Window Title : " + driver.getTitle());
		
		Set<String> WinHandle = driver.getWindowHandles();
		
		for(String handle : WinHandle)
		{
			System.out.println(handle);
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("Amazon"))
			{
				driver.findElement(By.xpath("/html/body/a/img")).click();
				Thread.sleep(3000);
				driver.quit();
				break;
				
			}
			
				
		}
		
		//driver.switchTo().window(parentWindow);
		//driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div/div/div[1]/div/input")).click();

	}

}
