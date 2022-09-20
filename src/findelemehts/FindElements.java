package findelemehts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		
		driver.manage().window().maximize();
		
		List<WebElement>buttons=driver.findElements(By.xpath("//a[contains(text(),'Try it Your')]"));
		
		
		buttons.get(0).click();
		Thread.sleep(2000);
		buttons.get(1).click();
		Thread.sleep(2000);
		buttons.get(2).click();
		Thread.sleep(2000);
		buttons.get(3).click();
		Thread.sleep(2000);
	}

}
