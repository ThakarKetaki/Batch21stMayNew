package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMAutomation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		WebElement userName= driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		
		
		WebElement login=driver.findElement(By.xpath("//*[text()=' Login ']"));
		login.click();
		
		//driver.quit();
		
	}

}
