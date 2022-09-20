package methodsWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementgetTextMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement logInButton=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		String text=logInButton.getText();
		System.out.println(text);
		
		String expectedText="Log In";
		
		if(text.equals(expectedText))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
			
		}
		
	}

}
