package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806192%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806192&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIi6L5x8Du8wIVGSQrCh321gAKEAAYASAAEgLwoPD_BwE%22");
		driver.manage().window().maximize();

		Thread.sleep(2);

		System.out.println(" Title of the page is :" + driver.getTitle());

		// Navigate to() method

		driver.navigate().to(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		Thread.sleep(2);

		System.out.println(" Title of the page is :" + driver.getTitle());

		// Navigate refresh() method

		driver.navigate().refresh();

		Thread.sleep(5);

		System.out.println(" Title of the page is :" + driver.getTitle());

		// Navigate back() method

		driver.navigate().back();

		Thread.sleep(5);

		System.out.println(" Title of the page is :" + driver.getTitle());

		// Navigate forward() method

		driver.navigate().forward();

		Thread.sleep(5);

		System.out.println(" Title of the page is :" + driver.getTitle());
		driver.close();

	}

}

// output:
//  Title of the page is :Sign up for Facebook | Facebook
//Title of the page is :Gmail
//Title of the page is :Gmail
//Title of the page is :Sign up for Facebook | Facebook
//Title of the page is :Gmail
