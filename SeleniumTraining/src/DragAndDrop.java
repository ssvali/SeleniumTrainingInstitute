import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	/**
	 * @param args
	 * 
	 * DragAndDrop - A convenience method that performs click-and-hold at the location of the source element, 
	 * 				 moves to the location of the target element, then releases the mouse.
	 * 
	 * 'build()' method is used to compile all the list of actions into a single step and ready to be performed.
	 * 
	 * We need to use perform() to execute the action.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		
		
	}

}
