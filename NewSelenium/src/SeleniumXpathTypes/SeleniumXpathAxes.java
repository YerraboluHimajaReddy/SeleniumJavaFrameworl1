package SeleniumXpathTypes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpathAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2);

		// ancestor method

		List<WebElement> doubleclicktext_ancestor = driver
				.findElements(By.xpath("//*[contains(@class,'widget-content')]/ancestor::div"));
		System.out.println(doubleclicktext_ancestor.size()); // 42

		// preceding method

		List<WebElement> doubleclicktext_preceding = driver
				.findElements(By.xpath("//*[contains(@id,'field1')]/preceding::div"));
		System.out.println(doubleclicktext_preceding.size()); // 143

		// Following method

		List<WebElement> doubleclicktext_following = driver
				.findElements(By.xpath("//*[contains(@id,'field1')]/following::div"));
		System.out.println(doubleclicktext_following.size()); // 60

		// Following sibling method

		WebElement doubleclicktext_FollowingSibling = driver
				.findElement(By.xpath("//*[contains(@id,'field1')]/following-sibling::input"));
		System.out.println(doubleclicktext_FollowingSibling.getAttribute("type")); // text

		// Child method

		WebElement doubleclicktext_child = driver
				.findElement(By.xpath("//*[contains(@class,'widget-content')]/child::input[1]"));
		System.out.println(doubleclicktext_child.getAttribute("value")); // Hello World!

		driver.close();

	}

}
