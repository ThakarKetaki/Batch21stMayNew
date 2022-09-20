package methodsWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementgetAttributeMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement logInButton= driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
	
		String attributeValue=logInButton.getAttribute("name");
		System.out.println(attributeValue);
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		
		Thread.sleep(2000);
		
		WebElement firstName=driver.findElement(By.xpath("//*[contains(@name,'firstname')]"));
		//firstName.sendKeys("ketaki");
        String atrributeValue1=firstName.getAttribute("placeholder");
        System.out.println(atrributeValue1);
		
		String expectedValue="First name";
		
		if(atrributeValue1.equalsIgnoreCase(expectedValue))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
	}

}
