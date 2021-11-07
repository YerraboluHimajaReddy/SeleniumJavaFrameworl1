package SeleniumFramesAndWindowHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//clicking on user profile
		driver.findElement(By.xpath("//*[contains(@id,'i-icon-profile')]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[contains(@id,'signInLink')]")).click();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Switching Frames
		driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@class,'modalIframe')]")));
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//span[contains(text(),'Sign in with Google')]//preceding::span[contains(text(),'Sign in with Google')]")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'icon-close')])[4]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.close();
	}

}
