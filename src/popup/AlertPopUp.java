package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		
		
		
		WebElement submitButton=driver.findElement(By.xpath("//input[@name='submit']"));
		submitButton.click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		Thread.sleep(2000);
		
		
	}

}
