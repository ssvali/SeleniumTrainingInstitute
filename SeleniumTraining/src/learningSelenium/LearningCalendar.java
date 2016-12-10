package learningSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LearningCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
		
		driver.findElement(By.xpath("//*[@id='DepartDate']")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody"));
		List<WebElement> rowCount = element.findElements(By.tagName("tr"));
		
		System.out.println(rowCount.size());
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]"));
		
		List<WebElement> ColCount = ele.findElements(By.tagName("td"));
		
		System.out.println(ColCount.size());
		
		for(int rCnt = 1; rCnt <= rowCount.size() ; rCnt++){
			
			for(int cCnt = 1; cCnt <= ColCount.size() ; cCnt++){
				
				String xPathPart1 = "//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[";
				String xPathPart2 = "]/td[";
				String xPathPart3 = "]/a";
				
				String xPath = xPathPart1+rCnt+xPathPart2+cCnt+xPathPart3;
//				System.out.println(xPath);
				
				try{
					String dt = driver.findElement(By.xpath(xPath)).getText();
					System.out.println(dt);
				} catch (Exception e){
					System.out.println("Value not found");
				}
				
				
				
						
			}
		}
		
	}

}
