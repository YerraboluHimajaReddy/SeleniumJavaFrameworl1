package SeleniumXpathTypes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpathTypes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2);

		// contains method

		// 1st way
		WebElement doubleclicktext = driver.findElement(By.xpath("//*[contains(text(),'Double Click')]"));
		System.out.println(doubleclicktext.getText());

		// 2ndway
		WebElement doubleclicktext1 = driver.findElement(By.xpath("(//*[contains(text(),'Double')])[1]"));
		System.out.println(doubleclicktext1.getText());

		// Starts-With method

		WebElement doubleclicktext_StartWith = driver.findElement(By.xpath("(//*[starts-with(text(),'Double')])[1]"));
		System.out.println(doubleclicktext_StartWith.getText());

		// text method
		// //tag_name[text()='Text of the element']
		// Ex: //*[text()='Double Click']
		WebElement doubleclicktext_text = driver.findElement(By.xpath("//*[text()='Double Click']"));
		System.out.println(doubleclicktext_text.getText());

		// And method
		// WebElement doubleclicktext_And =
		// driver.findElement(By.xpath("//*[contains(text(),'Double') and
		// @class='title']"));
		WebElement doubleclicktext_OR = driver.findElement(By.xpath("//*[text()='Double Click' and @class='title']"));
		System.out.println(doubleclicktext_OR.getText());

		// or method
		// WebElement doubleclicktext_And =
		// driver.findElement(By.xpath("//*[contains(text(),'Double') and
		// @class='title']"));
		List<WebElement> doubleclicktext_And = driver
				.findElements(By.xpath("//*[contains(text(),'Double Click') or @class='title']"));
		System.out.println(doubleclicktext_And.size());

		driver.close();

	}

}
