import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertsLearning {

	/**
	 * // Get a handle to the open alert, prompt or confirmation
			Alert alert = driver.switchTo().alert();
			
			Alert is an interface. There below are the methods that are used
			
			//Will Click on OK button.
			alert.accept();
			
			// Will click on Cancel button.
			alert.dismiss()
			
			//will get the text which is present on th Alert.
			alert.getText();
			
			//Will pass the text to the prompt popup
			alert.sendkeys();
	 * 
	 * 
	 */
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///E:/ConfirmationPopup.html");
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		String altText = alert.getText();
		System.out.println(altText);
		Thread.sleep(3000);
		alert.dismiss();
	
	}
	
	void SimpleAlert() throws InterruptedException{
		driver.get("file:///E:/SimpleAlert.html");
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		alert.dismiss();
		alert.sendKeys("abc");
		
	}

}
