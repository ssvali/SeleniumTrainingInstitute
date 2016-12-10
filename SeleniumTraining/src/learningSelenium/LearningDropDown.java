
package learningSelenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningDropDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String Val;
		Val = "ca";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='lang-chooser']"));
		List<WebElement> list = element.findElements(By.tagName("option"));
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext()){
//			System.out.println(it.next().getText());
			WebElement ele = it.next();
			String Str = ele.getAttribute("value");
			System.out.println(Str);
			if (Str.equals(Val)){
				ele.click();
				break;
				
			}
		}
		
		
	}

}
