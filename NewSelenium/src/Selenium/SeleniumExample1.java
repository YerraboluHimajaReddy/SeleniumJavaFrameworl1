package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Sony\\Desktop\\Python\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://mail.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();

	}

}
