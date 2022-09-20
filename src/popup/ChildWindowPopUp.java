package popup;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Ketaki\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		
		driver.manage().window().maximize();
		
		WebElement alertt=driver.findElement(By.xpath("(//a[contains(text(),'Try it Your')])[1]"));
		
		WebElement confirm=driver.findElement(By.xpath("(//a[contains(text(),'Try it Your')])[2]"));
		
		WebElement prompt=driver.findElement(By.xpath("(//a[contains(text(),'Try it Your')])[3]"));
		
		WebElement lineBreak=driver.findElement(By.xpath("(//a[contains(text(),'Try it Your')])[4]"));
		
		alertt.click();
		Thread.sleep(1000);
		confirm.click();
		Thread.sleep(1000);
		prompt.click();
		Thread.sleep(1000);
		lineBreak.click();
		Thread.sleep(1000);
		
		String mainWindow=driver.getWindowHandle(); //address of main window
		System.out.println("Main Window  "+mainWindow);
		Thread.sleep(2000);
		
		ArrayList<String> addres=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(addres.get(0));
		System.out.println(addres.get(1));
		System.out.println(addres.get(2));
		System.out.println(addres.get(3));
		System.out.println(addres.get(4));
		
		/*driver.switchTo().window(addres.get(1));
		String url1=driver.getCurrentUrl();
		System.out.println("Index 1: "+url1);
		Thread.sleep(2000);
		driver.switchTo().window(addres.get(2));
		String url2=driver.getCurrentUrl();
		System.out.println("Index 2: "+url2);
		Thread.sleep(2000);
		driver.switchTo().window(addres.get(3));
		String url3=driver.getCurrentUrl();
		System.out.println("Index 3: "+url3);
		Thread.sleep(2000);
		driver.switchTo().window(addres.get(4));
		String url4=driver.getCurrentUrl();
		System.out.println("Index 4: "+url4);*/
		
		
		
		for(int i=1;i<addres.size();i++)
		{
			driver.switchTo().window(addres.get(i));
			String Url=driver.getCurrentUrl();
			System.out.println("Index  "+ i+": "+Url);
			Thread.sleep(2000);
		}
		
		
//		Thread.sleep(4000);
//		WebElement tryIt=driver.findElement(By.xpath("(//button[text()='Try it']"));
//		tryIt.click();
//		
//		Alert alert=driver.switchTo().alert();
//		
//		alert.accept();
		
		
		
//		
		
		
		
		
		
		
		
		
	}

}
