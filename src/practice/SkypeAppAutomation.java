package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkypeAppAutomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1659979945&rver=7.1.6819.0&wp=MBI_SSL&wreply=https%3A%2F%2Flw.skype.com%2Flogin%2Foauth%2Fproxy%3Fclient_id%3D572381%26redirect_uri%3Dhttps%253A%252F%252Fweb.skype.com%252FAuth%252FPostHandler%26state%3Dd4271fc7-bd81-428f-80ca-bd4240435a72&lc=1033&id=293290&mkt=en-US&psi=skype&lw=1&cobrandid=2befc4b5-19e3-46e8-8347-77317a16a5a5&client_flight=ReservedFlight33%2CReservedFlight67");
		
		WebElement userName=driver.findElement(By.name("loginfmt"));
		userName.sendKeys("9890679671");
		
		Thread.sleep(2000);
		
		WebElement nextButton=driver.findElement(By.id("idSIButton9"));
		nextButton.click();
		
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.name("passwd"));
		password.sendKeys("Ketakithakar@2151");
	
		Thread.sleep(2000);
	
		WebElement signButton=driver.findElement(By.id("idSIButton9"));
		signButton.click();
		
		WebElement staySignInNoButton=driver.findElement(By.id("idBtn_Back"));
		staySignInNoButton.click();
		
		//driver.quit();
	
	}

}
