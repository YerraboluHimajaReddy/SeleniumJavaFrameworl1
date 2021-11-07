package SeleniumAdvancedConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.get("https://testautomationpractice.blogspot.com/");
		// Load the website
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2);

		System.out.println(" Title of the page is :" + driver.getTitle());

		// tr is ntt but table row , td is ntg but table column

		WebElement webtable = driver.findElement(By.xpath("//table[contains(@name,'BookTable')]"));
		if (webtable.isDisplayed()) {

			System.out.println(" webtable is displayed in the web page");

			List<WebElement> rows_list = driver.findElements(By.xpath("//table[contains(@name,'BookTable')]/tbody/tr"));
			if (rows_list.size() != 0) {

				System.out.println(" table  have rows ");

				for (int i = 1; i <= rows_list.size(); i++) {

					System.out.println(" row value is :" + i);

					if (i == 1) {

						List<WebElement> columnns_list_headers = driver
								.findElements(By.xpath("//table[contains(@name,'BookTable')]/tbody/tr[" + i + "]/th"));

						for (WebElement headers : columnns_list_headers) {
							System.out.println(" headers text is : " + headers.getText());
						}

					} else {
						List<WebElement> columnns_list = driver
								.findElements(By.xpath("//table[contains(@name,'BookTable')]/tbody/tr[" + i + "]/td"));

						if (columnns_list.size() != 0) {

							System.out.println(" table  have columns ");

							for (int j = 1; j <= columnns_list.size(); j++) {

								WebElement column_text = driver.findElement(By.xpath(
										"//table[contains(@name,'BookTable')]/tbody/tr[" + i + "]/td[" + j + "]"));

								System.out.println(" Column text in a table is :" + column_text.getText());

								if (column_text.getText().equalsIgnoreCase("Java")) {
									System.out.println(" Seraching data is present in the table");
									break;
								}

							}
						} else
							System.out.println(" table doesn't have columns ");

					}

				}

			} else
				System.out.println(" table doesn't have rows ");

		} else
			System.out.println(" webtable not displayed in the web page");

		driver.quit();

	}

}

// output:
// Title of the page is :Automation Testing Practice
// webtable is displayed in the web page
// table have rows