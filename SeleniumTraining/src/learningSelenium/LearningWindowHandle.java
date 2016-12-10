
package learningSelenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LearningWindowHandle {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		String popupWindowId = null;
//		while(it.hasNext()){
//			popupWindowId = it.hasNext();
//		}
		

	
	}
	
	public static void SwitchToLastWindow(){
		
	}
	
	

}
