package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGSampleProgram2 extends CrossBrowserTesting {

	@BeforeSuite
	public void launchBrowser() {

		CrossBrowserTesting.crossBrowser("chrome");
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@BeforeMethod
	public void getTitleOfThepage() {

		System.out.println(" Title of the page :" + driver.getTitle());
	}

	@Test
	public void enterTextInTheFiedl() {

		WebElement field1_textbox = driver.findElement(By.xpath("//input[contains(@id,'field1')]"));
		field1_textbox.clear();
		field1_textbox.sendKeys("Himaja Reddy Yerrabolu");
	}

	@Test(dependsOnMethods = "enterTextInTheFiedl")
	public void enterTextInTheFied2() {

		WebElement field2_textbox = driver.findElement(By.xpath("//input[contains(@id,'field2')]"));
		field2_textbox.clear();
		field2_textbox.sendKeys("Java Class");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}
