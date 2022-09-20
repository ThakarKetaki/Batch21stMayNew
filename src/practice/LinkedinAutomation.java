package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinAutomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("ketaki12@gmail.com");
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("ketaki@123");
		Thread.sleep(2000);
		
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign in']"));
		loginBtn.click();
		
	}

}
