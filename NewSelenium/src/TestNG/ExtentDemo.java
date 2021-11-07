//package TestNG;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReporter;
//import com.aventstack.extentreports.ExtentTest;
//public class ExtentDemo {
//static ExtentTest test;
//static ExtentReporter report;
//@BeforeGroups
//public static void startTest()
//{
//report = new ExtentReporter(System.getProperty("\\ExtentReportResults.html");
//test = ((Object) report).startTest("ExtentDemo");
//}
//@Test
//public void extentReportsDemo()
//{
//System.setProperty("webdriver.chrome.driver", "D:\\SubmittalExchange_TFS\\QA\\Automation\\3rdparty\\chrome\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.google.co.in");
//if(driver.getTitle().equals("Google"))
//{
//test.log(LogStatus.PASS, "Navigated to the specified URL");
//}
//else
//{
//test.log(LogStatus.FAIL, "Test Failed");
//}
//}
//@AfterClass
//public static void endTest()
//{
//report.endTest(test);
//report.flush();
//}
//}
//
