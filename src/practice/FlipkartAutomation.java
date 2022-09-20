package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/account/login?ret=/");
		
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("9890679671");
		Thread.sleep(2000);
		
		email.clear();
		Thread.sleep(2000);
		
		email.sendKeys("9890679671");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Abcd@1234");
		Thread.sleep(2000);
		
		
		WebElement loginButton=driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]"));
		loginButton.click();
		
	}

}
