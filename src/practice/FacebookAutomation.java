package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("ketut@gmail.com");
		Thread.sleep(2000);
		
		WebElement  password=driver.findElement(By.name("pass"));
		password.sendKeys("Ketu@214132");
		Thread.sleep(2000);
		
		WebElement logIn=driver.findElement(By.linkText("Log In"));
		logIn.click();	
		
		
		
	}

}
