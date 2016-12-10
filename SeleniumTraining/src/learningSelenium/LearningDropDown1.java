package learningSelenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LearningDropDown1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='lang-chooser']"));
		
		List<WebElement> list = element.findElements(By.tagName("option"));
		
		Iterator<WebElement> it = list.iterator();
		
		while(it.hasNext()){
			
			try {

				WebElement ele = it.next();
				String Str = ele.getAttribute("selected");
			
				if (Str.equals("true")){
					String Strval = ele.getAttribute("Value");
					String SelectedVal = ele.getText();
					System.out.println("Selected Value ' " + Strval + " ' Its Text is  ' " + SelectedVal + " ' ");
					break;
					
				}
				
				} catch (Exception e)
			{
				
			}
				
			}
			driver.close();
		}
	}


