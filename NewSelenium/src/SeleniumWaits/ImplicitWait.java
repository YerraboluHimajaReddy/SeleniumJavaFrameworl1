package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setProperty method is used to set any type of driver path
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Implicit Wait

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement field1_textbox = driver.findElement(By.xpath("//*[contains(@id,'field1')]"));
		if (field1_textbox.isDisplayed()) {

			System.out.println(" field1_textbox text is displayed");
			if (field1_textbox.getText() != null) {
				System.out.println(" field1_textbox is :" + field1_textbox.getAttribute("value"));
				field1_textbox.clear();
				field1_textbox.sendKeys(" Hello Himaja Reddy");
				System.out.println(" field1_textbox is :" + field1_textbox.getAttribute("value"));

			} else {
				System.out.println(" field1_textbox is empty");
				System.out.println(" field1_textbox is :" + field1_textbox.getAttribute("value"));
				field1_textbox.sendKeys(" Hello Himaja Reddy");
				System.out.println(" field1_textbox is :" + field1_textbox.getAttribute("value"));
			}

		} else {
			System.out.println(" field1_textbox  is not displayed");
		}

		driver.close();

	}

}

//output:
// field1_textbox text is displayed
//field1_textbox is :Hello World!
//field1_textbox is : Hello Himaja Reddy
