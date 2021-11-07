package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();

		// Java Static wait
		Thread.sleep(2);

		System.out.println(" Title of the page is :" + driver.getTitle());

		// sendkeys method is used to type something on the textbox
		WebElement username = driver.findElement(By.id("identifierId"));

		boolean isEnabled= username.isEnabled();
		System.out.println(" is Enabled value :" + isEnabled);

		if (isEnabled)

		{
			System.out.println(" Username element is  displayed  ");
			username.sendKeys("himaja04.selenium@gmail.com");
			Thread.sleep(2);
		} else {
			System.out.println(" Username element is not displayed  ");
		}

		driver.close();

	}

}

// output:
// Title of the page is :Gmail
// is Enabled value :true
//Username element is  displayed  

