package methodsWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementisDisplayedMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		WebElement Emailid = driver.findElement(By.xpath("// input[@name='email']"));
				 System.out.println("Email id status "+ Emailid.isDisplayed());
				 WebElement Password = driver.findElement(By.xpath("// input[@name='pass']"));
				 System.out.println("Password status "+Password.isDisplayed());
//		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
//		Thread.sleep(2000);
//		
//		WebElement customRadioButton=driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
//		customRadioButton.click();
//		
//		Thread.sleep(1000);
//
//		
//		WebElement gender=driver.findElement(By.xpath("//input[@name='custom_gender']"));
//		boolean result=gender.isDisplayed();
//		
//		if(result==true)
//		{
//			gender.sendKeys("Test");
//		}

	}

}
