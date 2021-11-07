package SeleniumMethods;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// get() method is used to launch your url
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525806192%7Ce%7Cfacebook%20login%7C&placement=&creative=550525806192&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007743%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIi6L5x8Du8wIVGSQrCh321gAKEAAYASAAEgLwoPD_BwE");

		driver.manage().window().maximize();

		// Java Static wait
		Thread.sleep(2);

		String title_of_the_page = driver.getTitle();

		System.out.println(" Title of the current web page is :" + title_of_the_page);
		
		int title_length = driver.getTitle().length();

		System.out.println(" length of the current web page is :" + title_length);
		
		if(title_of_the_page.equals("SigN up for Facebook | Facebook"))
		{
			System.out.println(" Both page titles are same ");
		}else {
			System.out.println(" Both page titles are not same ");
		}
		
		
		
		if(title_of_the_page.equalsIgnoreCase("Sign up for Facebook | Facebook"))
		{
			System.out.println(" Both page titles are same ");
		}else {
			System.out.println(" Both page titles are not same ");
		}
		
		
		
		if(title_of_the_page.contains("Sign up for Facebook | Facebook"))
		{
			System.out.println(" Both page titles are same ");
		}else {
			System.out.println(" Both page titles are not same ");
		}
		driver.close();
	}

}

// output:
// Title of the current web page is :Sign up for Facebook | Facebook
//length of the current web page is : :31
// Both page titles are same 
//Both page titles are same 
//Both page titles are same 