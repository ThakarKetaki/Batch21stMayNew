package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomMeetingAutomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://zoom.us/signin");
		
		
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("ketakithakar30@gmail.com");
		
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Thakar@2151");
		
		WebElement signInBtn=driver.findElement(By.partialLinkText("Sign "));
		signInBtn.click();
		
		
	}	

}
