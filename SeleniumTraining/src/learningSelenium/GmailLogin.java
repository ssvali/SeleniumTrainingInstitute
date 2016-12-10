package learningSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
//		try {
			
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.gmail.com");
		
//		LaunchAUT("http://www.gmail.com" , driver);
		
		String b = driver.findElement(By.partialLinkText("Create")).getText();
		System.out.println(b);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vali.shah");
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("Nawaz@123");
		driver.findElement(By.xpath("//input[@id='signIn']")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if (Title.equals("Google Accounts")){
			System.out.println("Login Successful");
		} else {
			System.out.println("Login failed");
		}
		
		Thread.sleep(8000);
		String a = driver.findElement(By.partialLinkText("Inbox")).getText();
		System.out.println(a);
		
		driver.findElement(By.xpath("//a[@class='gb_q gb_O gb_j gb_J']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
			
//		} catch (Exception e) {
//			System.out.println("Error Occured in Script");
//		}
		

	} 
	
//	public void LaunchAUT (String URL)
//	{
//		driver.navigate().to(URL);
//		
//	}

}
