package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubr
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement table = driver.findElement(By.xpath("//*[@id='login_form']/table"));
		List<WebElement> li = table.findElements(By.tagName("tr"));
		System.out.println("Number of Rows " + li.size());
		for(int i=0; i<li.size();i++)
		{
			
		}
		
		/*WebElement table = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
		
		List<WebElement> ele = table.findElements(By.tagName("input"));
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++)
		{
			String text = ele.
			System.out.println(text);
			
			if(text.equalsIgnoreCase("Milk")){
				ele.get(i).click();
				break;
			}
		}

	}
*/
}
}
