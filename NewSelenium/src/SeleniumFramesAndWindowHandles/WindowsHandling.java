package SeleniumFramesAndWindowHandles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.get("https://testautomationpractice.blogspot.com/");
		// Load the website
		driver.get("http://www.naukri.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2);

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		System.out.println(" Title of the page is :" + driver.getTitle());

		// it will return list of web pages
		Set<String> s = driver.getWindowHandles();
		System.out.println(" size of windows is :" + s.size());

		if (s.size() != 0)

		{
			// Now iterate using Iterator
			Iterator<String> naukriset = s.iterator();

			while (naukriset.hasNext()) {
				String child_window = naukriset.next();

				if (!parent.equals(child_window)) {
					driver.switchTo().window(child_window);
					System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
					System.out.println(driver.switchTo().window(child_window).getTitle());

				}
			}
		} else
			System.out.println(" application contains only single page");
		
		driver.switchTo().defaultContent();
		System.out.println(" Title of the page is :" + driver.getTitle());		
		
		driver.switchTo().defaultContent();
		System.out.println(" Title of the page is :" + driver.getTitle());
		driver.close();
		
		driver.switchTo().defaultContent();
		System.out.println(" Title of the page is :" + driver.getTitle());
		driver.close();

		// switch to the parent window this is ntg but first page
		driver.switchTo().window(parent);
		System.out.println(" Title of the page is :" + driver.getTitle());

		//driver.quit();

	}
}
