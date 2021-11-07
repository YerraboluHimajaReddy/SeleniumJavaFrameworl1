package SeleniumAlertsAndWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(2);

		driver.findElement(By.xpath("//*[contains(text(),'Click Me')]")).click();
		Thread.sleep(2);

		// Alert handling

		// 1) getText(): it returns the alert text

		String alert_text = driver.switchTo().alert().getText();

		System.out.println(" alert text is :" + alert_text);

		// 2) accept(): it will accept the alert means click ok button

		// driver.switchTo().alert().accept();
		//
		//
		// WebElement
		// verify_Alert_AcceptText=driver.findElement(By.xpath("//*[contains(@class,'widget-content')]/p[@id='demo']"));
		//
		// if(verify_Alert_AcceptText.getText().equals("You pressed OK!")) {
		// System.out.println(verify_Alert_AcceptText.getText() + " is same as :" +"You
		// pressed OK!");
		// }

		// 3) dismiss(): it will cancel the alert means click cancel button

		driver.switchTo().alert().dismiss();

		WebElement verify_Alert_AcceptText = driver
				.findElement(By.xpath("//*[contains(@class,'widget-content')]/p[@id='demo']"));

		if (verify_Alert_AcceptText.getText().equals("You pressed Cancel!")) {

			System.out.println(" Both the text's are same :" + "You pressed Cancel!");
		}

		// 4) sendkeys: this method is used to enter text to the textbox in the alerts
//		driver.switchTo().alert().sendKeys("himajareddy");
//		driver.switchTo().alert().dismiss();

		driver.quit();
	}

}

// output:
// alert text is :Press a button!
// You pressed OK! is same as :You pressed OK!
// You pressed Cancel! is same as :You pressed Cancel!