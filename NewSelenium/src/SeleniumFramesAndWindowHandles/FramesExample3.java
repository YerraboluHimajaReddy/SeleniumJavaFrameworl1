package SeleniumFramesAndWindowHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// identifying the frame using locator or say using webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='eduFooterWrap']//iframe[1]")));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SoftwareTestingHelp.com");
		driver.findElement(By.name("email")).sendKeys("himaja04.selenium");

		// driver.close();
	}

}
