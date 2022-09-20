package iframe;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfIframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alertBox=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[1]"));
		alertBox.click();
		
		ArrayList<String>addres =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addres.get(1));
		
		Thread.sleep(2000);
		//3 ways to switch the focus to iframe
		//1)Using index=html index of that iframe which we want to locate(html index 2 but we have to give java index)
		//2)Using String name or id=both are in String format
		//3)Using webelement(locate that iframe using xpath)=pass that webelement reference to methodtryItButton 
		
		
		
		/*
		 * First Way
		 * driver.switchTo().frame(1);
		 * */
		
		/*Second Way
		 * 
		 * driver.switchTo().frame("iframeResult");*/
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		WebElement tryItButton=driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(2000);
		tryItButton.click();
		
		Alert alert=driver.switchTo().alert();
		
		Thread.sleep(3000);
		alert.accept();
		

		
		
		
	}

}
