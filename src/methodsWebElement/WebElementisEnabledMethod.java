package methodsWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementisEnabledMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Velocity");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Velocity");
		
		WebElement logInButton=driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result=logInButton.isEnabled();
		
		if(result==true)
		{
			logInButton.click();
		}
		else
		{
			System.out.println("Log In Button is Disabled");
		}
		
//		
		
		
	}

}
