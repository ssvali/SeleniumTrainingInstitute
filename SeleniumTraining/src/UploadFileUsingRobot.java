import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UploadFileUsingRobot {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		Thread.sleep(3000);
		
		String FilePathToUpload="E:\\text.txt";
		
		StringSelection stringSelection = new StringSelection(FilePathToUpload);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		   Robot robot = new Robot();

           robot.keyPress(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_V);
           robot.keyRelease(KeyEvent.VK_V);
           robot.keyRelease(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
