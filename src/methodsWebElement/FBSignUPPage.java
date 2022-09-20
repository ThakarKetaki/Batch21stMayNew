package methodsWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUPPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mayuri");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8999331907");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Mayuri@12345");
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(day);
		s1.selectByIndex(4);
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(month);
		s2.selectByValue("11");
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1991");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]/following-sibling::input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up') and @name='websubmit' ]")).click();
		
		
		//button[contains(text(),'Sign Up') and @name='websubmit' ]
	}

}
