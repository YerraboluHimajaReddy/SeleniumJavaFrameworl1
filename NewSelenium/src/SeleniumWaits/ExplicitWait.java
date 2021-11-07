package SeleniumWaits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// setProperty method is used to set any type of driver path
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//*[contains(text(),'Click Me')]")).click();
		Thread.sleep(2);


		// explicit wait - to wait for the Cpy text button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Click
		// Me')]")));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(@id,'field2')])[1]")));
		System.out.println(" Element presence is found");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@id,'field2')])[1]")));

		System.out.println(" Element clicked successfully");
		// driver.findElement(By.xpath("(//*[contains(@name,'RESULT_TextField')])[1]")).sendKeys("Himaja
		// Reddy");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("(//*[contains(@id,'field2')])[1]")).sendKeys("Himaja Reddy");

		Thread.sleep(2);

		// Fluent Wait
		
//		Wait wait1 = new FluentWait<WebDriver>(driver)
//				.withTimeout(35)
//				.pollingevery(5, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
//		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
//		
//			public WebElement apply(WebDriver driver ) {
//				return driver.findElement(By.xpath("(//*[contains(@id,'field2')])[1]"));
//			}
//		});
//		
//		clickseleniumlink.sendKeys("Himaja Reddy");

		driver.close();

	}

}

//output:
// Element presence is found
//Element clicked successfully
