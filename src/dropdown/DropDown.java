package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
	public static void main(String[] args) throws InterruptedException 

	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(day);
		s1.selectByIndex(1);  //int index as argument and returns void
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(month);
		s2.selectByValue("4");  //String value as argument and returns void
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		s3.selectByVisibleText("2000"); //String text as argument and returns void
		
		
		
		
		
		
		
		
	}
	

}
