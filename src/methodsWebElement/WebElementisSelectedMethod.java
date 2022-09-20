package methodsWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementisSelectedMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement createNewButton=driver.findElement(By.xpath("//a[contains(text(),'New Account')]"));
		createNewButton.click();
		
		Thread.sleep(2000);
		
		WebElement customRadioButton=driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
		customRadioButton.click();
		
		Thread.sleep(1000);
		
		boolean result=customRadioButton.isSelected();
		System.out.println(result);
		
		WebElement selectPronoun=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		selectPronoun.click();
		//select[@name='preferred_pronoun']
		
		
	}

}
