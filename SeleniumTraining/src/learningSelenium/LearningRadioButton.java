package learningSelenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LearningRadioButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String ChkVal;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		WebElement element = driver.findElement(By.xpath("html/body/div[1]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> list = element.findElements(By.tagName("input"));
		
		Iterator<WebElement> it = list.iterator();
		
		/*while(it.hasNext()){
			
			try {

				WebElement ele = it.next();
				
				String Str = ele.getAttribute("checked");
				System.out.println(Str);
			
				if (Str.equals("true")){
					String Strval = ele.getAttribute("Value");
					System.out.println("Selected Value ' " + Strval);
					break;
					
				}
				
				} catch (Exception e)
			{
				
			}
				
			}
			driver.close();*/
		
		while(it.hasNext()){
			
			try {

				WebElement ele = it.next();
				
				String Str = ele.getAttribute("name");
				
			
				if (Str.equals("group1")){
					String Strval = ele.getAttribute("Value");
					System.out.println(Strval);
					try{
						String Chk = ele.getAttribute("checked");
						if (Chk != null){
							ChkVal = ele.getAttribute("Value");
							
						}
					} catch (Exception e) {
						
					}
					
					System.out.println("Selected Value in Group 1 :- ");// + ChkVal);
				
				} else {
					String Strval = ele.getAttribute("Value");
					System.out.println(Strval);
					try{
						String Chk = ele.getAttribute("checked");
						if (Chk != null){
							ChkVal = ele.getAttribute("Value");
							System.out.println("Selected Value in Group 2 :- " + ChkVal);
						}
					} catch (Exception e) {
						
					}
				}
				
				} catch (Exception e)
			{
				
			}
				
			}
			driver.close();

		
		
		
	}

}
