package SeleniumAlertsAndWaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://live.browserstack.com/dashboard#os=android&os_version=5.0&device=Google+Nexus+6&zoom_to_fit=true&full_screen=true&url=www.browserstack.com%2Fwelcome&speed=1");
		driver.manage().window().maximize();

		Thread.sleep(2);
		
		driver.findElement(By.xpath("//*[contains(text(),'Sign in with Google')]")).click();
		Thread.sleep(2);
		
		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage);
		
		driver.close();

	}

}
