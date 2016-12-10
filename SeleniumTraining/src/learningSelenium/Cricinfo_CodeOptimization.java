package learningSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cricinfo_CodeOptimization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize(); // To Maximize the Window
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.get("http://www.espncricinfo.com/new-zealand-v-india-2014/engine/match/667645.html");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='inningsBat1']/tbody"));
		
		List<WebElement> rCount = element.findElements(By.tagName("a"));
		
		System.out.println(rCount.size());
		
		int j=1;
		
		for(int rCnt=1; rCnt<=rCount.size(); rCnt++){
			j = j+2;
			String xPath1 = "//*[@id='inningsBat1']/tbody/tr[";
			String xPath2 = "]/td[2]";
			String xPath = xPath1+(j)+xPath2;
			String xPath3 = "]/td[4]";

			String pName = element.findElement(By.xpath(xPath)).getText();
			
			String pRuns = element.findElement((By.xpath(xPath1+(j)+xPath3))).getText();
			System.out.println("Player Name - ' " + pName + " ' Runs Scored := " + pRuns);
	}
		driver.close();
	}

}
