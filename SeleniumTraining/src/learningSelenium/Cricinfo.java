package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cricinfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/new-zealand-v-india-2014/engine/match/667645.html");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='inningsBat1']/tbody"));
		
		List<WebElement> rCount = element.findElements(By.tagName("tr"));
		
//		System.out.println(rCount.size());
		
		
		for(int rCnt=1; rCnt<=rCount.size();rCnt++){
			String xPathPart1 = "//*[@id='inningsBat1']/tbody/tr[";
			String xPathPart2 = "]";
			String XPath = xPathPart1+rCnt+xPathPart2;
			WebElement element1 = element.findElement(By.xpath(XPath));
			List<WebElement> cCount = element1.findElements(By.tagName("td"));
//			System.out.println(cCount.size());
			
			for(int cCnt=1; cCnt<=cCount.size();cCnt++){
				
				try{
					
					String xPathPart3 = "/td[";
					String xPathPart4 = "]";
					
					String xPath1 = xPathPart1+rCnt+xPathPart2+xPathPart3+cCnt+xPathPart4;
//					System.out.println(xPath1);
					
					WebElement ele = element.findElement(By.xpath(xPath1));
					String cName = ele.getAttribute("class");
					if(cName.equals("playerName")){
						String pName = ele.getText();
						System.out.println(pName);
					}
					
					if(cName.equals("battingRuns")){
						String Run = ele.getText();
						System.out.println(Run);
						
					}
					
					
										
					
				} catch (Exception e){
					
				}
				
			}
			
		}
		
	}

}
