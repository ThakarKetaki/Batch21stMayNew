package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1
{
	static WebDriver driver;
	static int i=1;

	public static void captureScreenShot() throws IOException
    {

        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("F:\\Velocity Ketaki\\ScreenShot\\Test"+i+".jpeg");
		FileHandler.copy(source, dest);
		i++;
    }
	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(4000);
		
		captureScreenShot();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mayuri");
		Thread.sleep(2000);
		
		captureScreenShot();
		

		
	}

}
