package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAutomation 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		
		
		//Thread.sleep(2000);
		//WebElement userName=driver.findElement(By.name("username"));
		WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("ketaki12thakar@gmail.com");
		
		//Thread.sleep(2000);
		//WebElement password=driver.findElement(By.name("password"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Ketaki@1234");
		
		//WebElement logInBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		//logInBtn.click();
		
		WebElement logInBtn1=driver.findElement(By.xpath("//div[text()='Log In']"));
		logInBtn1.click();
	}

}