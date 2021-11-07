package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
	public static WebDriver driver;

	public static void crossBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sony\\Desktop\\Python\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("Firefox")) {
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\Sony\\Desktop\\Python\\IEDriverServer.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

}
