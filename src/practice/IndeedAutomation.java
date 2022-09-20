package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedAutomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F&tmpl=desktop&service=my&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fin.indeed.com%2F&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess&_ga=2.75683925.1719191148.1660384348-1021502255.1660384348");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='ifl-InputFormField-3']"));
		email.sendKeys("ketakithakar30@gmail.com");
		Thread.sleep(2000);
		
		WebElement nextButton=driver.findElement(By.xpath("//button[@type='submit']"));
		nextButton.click();
		Thread.sleep(2000);
		
		WebElement logInWithPassword=driver.findElement(By.partialLinkText("Log in with a password"));
		logInWithPassword.click();
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Ketaki@123");
		Thread.sleep(2000);
		
	    WebElement signIn=driver.findElement(By.xpath("//span[text()='Sign in']"));
	    signIn.click();
		
		//span[text()='Sign in']
		
		
	}

}
