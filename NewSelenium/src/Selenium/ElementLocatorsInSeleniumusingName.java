package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ElementLocatorsInSeleniumusingName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Desktop\\Python\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806192%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806192&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIi6L5x8Du8wIVGSQrCh321gAKEAAYASAAEgLwoPD_BwE");
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//maximixe is the method to enlarge/ to increase the size of a web browser yoour weboage
		
		driver.manage().window().maximize();
		
		// Java Static wait
		Thread.sleep(2);
		
		// sendkeys method is used to type something on the textbox
		//1st way 
		driver.findElement(By.name("identifier")).sendKeys("himaja04.selenium@gmail.com");		
		Thread.sleep(2);
		
		//2nd way
		// Syntax:
		//WebElement elementName = driver.findElement(By.LocatorStrategy("LocatorValue"));
		WebElement username=driver.findElement(By.name("identifier"));
		
		// clear method is used to clear the text in the textbox
		username.clear();
		Thread.sleep(2);
		username.sendKeys("himaja04.selenium@gmail.com");	

		Thread.sleep(2);
		driver.close();
		

	}

}
