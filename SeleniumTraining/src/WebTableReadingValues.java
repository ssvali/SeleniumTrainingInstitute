import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTableReadingValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement table = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int rCount=0; rCount<rows.size();rCount++)
		{
			List<WebElement> cols = rows.get(rCount).findElements(By.tagName("td"));
			for(int cCount=0;cCount<cols.size();cCount++)
			{
				String celltext = cols.get(cCount).getText();
				System.out.println(celltext);
			}
		}
		
		/*String xp1 = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[";
		String xp2 = "]/td[2]";
		System.out.println(rows.size());
		for(int rCount=0; rCount<rows.size();rCount++)
		{
			int r = rCount+1;
			String text = rows.get(rCount).findElement(By.xpath(xp1+r+"]/td[1]")).getText();
			//System.out.println(rCount + " -- " + text);
			if(text.equals("Los Angeles to Chicago")){
				String tktValue = driver.findElement(By.xpath(xp1+r+xp2)).getText();
				System.out.println(text + " -- " +tktValue);
				break;
			}
			List<WebElement> cols = rows.get(rCount).findElements(By.tagName("td"));
			for(int cCount=0;cCount<cols.size();cCount++)
			{
				String celltext = cols.get(cCount).getText();
				System.out.println(celltext);
			}
		}
*/		

	}

}
