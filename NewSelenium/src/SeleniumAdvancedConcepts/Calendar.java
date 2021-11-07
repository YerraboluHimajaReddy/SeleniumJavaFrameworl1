package SeleniumAdvancedConcepts;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Sony/Desktop/Python/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.get("https://testautomationpractice.blogspot.com/");
		// Load the website
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		System.out.println(" Title of the page is :" + driver.getTitle());

		// date picker
		driver.findElement(By.xpath("//input[contains(@id,'datepicker')]")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		WebElement calendar_table = driver.findElement(By.xpath("//*[contains(@class,'ui-datepicker-calendar')]"));

		if (calendar_table.isDisplayed()) {
			System.out.println(" Calendar tabel is displayed");

			List<WebElement> list_rows = driver
					.findElements(By.xpath("//*[contains(@class,'ui-datepicker-calendar')]/tbody/tr"));

			if (list_rows.size() != 0) {
				System.out.println(" rows are displayed in the calendar table");

				for (int i = 1; i <= list_rows.size(); i++) {

					List<WebElement> columns_rows = driver.findElements(
							By.xpath("//*[contains(@class,'ui-datepicker-calendar')]/tbody/tr[" + i + "]/td"));

					if (columns_rows.size() != 0) {
						System.out.println(" Columns are displayed in the calendar table");

						for (int j = 1; j <= columns_rows.size(); j++) {

							WebElement date = driver
									.findElement(By.xpath("//*[contains(@class,'ui-datepicker-calendar')]/tbody/tr[" + i
											+ "]/td[" + j + "]"));
							System.out.println(date.getText());

							// static date

							if (date.getText().equalsIgnoreCase("6")) {
								date.click();
							}

							// Dynamic date
							
//							LocalDate today=java.time.LocalDate.now();
//							System.out.println(today);
//							if (date.getText().equalsIgnoreCase(today.toString())) {
//								date.click();
//							}
						}

					} else
						System.out.println(" Columns are not displayed in the calendar table");

				}
			} else
				System.out.println(" rows are not displayed in the calendar table");
		} else
			System.out.println(" Calendar tabel is not displayed");

		driver.quit();

	}

}

/*
 * output: Title of the page is :Automation Testing Practice Calendar tabel is
 * displayed rows are displayed in the calendar table
 */
