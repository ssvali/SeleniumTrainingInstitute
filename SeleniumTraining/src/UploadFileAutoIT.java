import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UploadFileAutoIT {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\FileUpload.exe");
		
		Runtime rs = Runtime.getRuntime();
		rs.exec("Notepad");
		
		
		//Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
	}

}
