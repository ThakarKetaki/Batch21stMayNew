package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.facebook.com");
		
		//driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		//button.click();  //WebElement chi method aahe
		
		Actions act=new Actions(driver);
		
		act.click(button).perform();
		
		
		/*Methods of Mouse Actions*/
		// 1) act.click()
		//act.moveToElement(button).click().build().perform();
		
//		//2) act.contextClick() to perform right click
//		Thread.sleep(4000);
//		WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
//		userName.sendKeys("Admin");
//		Thread.sleep(2000);
//		
//		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("admin123");
//		Thread.sleep(2000);
//		
//		act.contextClick().perform();
//		Thread.sleep(2000);
//		
//		WebElement login=driver.findElement(By.xpath("//*[text()=' Login ']"));
//		//login.click();
//		
//		
//		act.moveToElement(login).click().build().perform();
//		Thread.sleep(2000);
//		act.contextClick().perform();
//
		
		
		
		
		
	}

}
