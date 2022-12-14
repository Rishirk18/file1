package extentreports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class e1 {
	//step1: adding dependency code
	//step2: creating an object for extent report class
	//step3: passing path where reports should be
	//step4: starting test case
	
	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public  void startTest()
	{
	//creating an object for extent reports class, pass path as input, globally
	report = new ExtentReports("C:\\Users\\admin\\eclipse-workspace\\mvn\\src\\main\\java\\extentreports\\d.html");
	// test start ,finish, loging
	test = report.startTest("e1");

	test.log(LogStatus.ERROR,"it may fail");
	test.log(LogStatus.INFO,"in before class");

	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	Assert.assertEquals(driver.getTitle(),"Google");
	test.log(LogStatus.PASS,"Test case passed ");
	test.setDescription("this is about google");
	driver.quit();

	}

	@AfterClass
	public void endTest()
	{
	test.log(LogStatus.INFO,"in after class");
	report.endTest(test);
	report.flush();
	}

}
