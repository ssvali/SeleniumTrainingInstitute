import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DownloadFileToDefaultFolder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
	    driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
	    driver.findElement(By.linkText("smilechart.xls")).click();

	}

}
