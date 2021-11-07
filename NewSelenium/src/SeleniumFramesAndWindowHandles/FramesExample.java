package SeleniumFramesAndWindowHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Frames")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());
		List<WebElement> framelist = new ArrayList<WebElement>(driver.findElements(By.tagName("frame")));
		System.out.println(" no of franes in a webpage is :" + framelist.size());
		
		// frame using index 
//		driver.switchTo().frame(1);
//		
//		driver.switchTo().defaultContent();
		
		// frame using name
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@src,'/frame_right')]")));
//		//driver.switchTo().frame("frame-middle");
//		
//		System.out.println(" in frame-middle ");
//		
//		driver.switchTo().defaultContent();
	
		// if we are unable to find frame name /id at the time we go for xpath's
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@src,'/frame_right')]")));
//		
//		System.out.println(" in frame-right ");
//		// frame using id
//		//driver.switchTo().frame("a07755ee");
//		
//		
//		//default content method is used to switch back to praent frame or parent window
//		driver.switchTo().defaultContent();
//		System.out.println(" in parent frame ");
		

		 driver.switchTo().frame("frame-bottom");
		
		 System.out.println(driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]")).getText());
		 driver.switchTo().defaultContent();
		driver.close();
	}

}
