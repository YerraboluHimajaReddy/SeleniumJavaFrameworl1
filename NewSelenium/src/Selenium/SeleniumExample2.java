package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.gmail.com");
//		driver.manage().window().maximize();
//		
//		driver.close();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Sony\\Desktop\\Python\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.close();
		

	}

}
