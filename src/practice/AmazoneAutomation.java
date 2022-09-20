package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneAutomation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3Fie%3DUTF8%26keywords%3Damazon%2Bprime%2Blogin%2Bindia%26index%3Daps%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin%26adgrpid%3D60002138638%26hvpone%3D%26hvptwo%3D%26hvadid%3D590512063151%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3465865276989498224%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007788%26hvtargid%3Dkwd-435775516503%26hydadcr%3D15701_2267224%26gclid%3DEAIaIQobChMI79y_rPG2-QIVwUQrCh3TyAnVEAAYASAAEgLWIfD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("9894579671");
		
		Thread.sleep(2000);
		
		WebElement continueButton=driver.findElement(By.id("continue"));
		continueButton.click();
		
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("abcd@12345");
	
		Thread.sleep(2000);
		
		
		WebElement signButton=driver.findElement(By.id("signInSubmit"));
		signButton.click();
		
		//driver.quit();
	}

}
