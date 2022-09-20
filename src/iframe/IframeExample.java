package iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		WebElement tryItButton=driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		tryItButton.click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
		Thread.sleep(2000);
		
	driver.switchTo().parentFrame();//switch focus to immediate parent frame
		
//		driver.switchTo().defaultContent(); //switch focus on main webpage
		WebElement runButton=driver.findElement(By.xpath("//a[@id='menuButton']"));
		runButton.click();

		
		
	}

}
