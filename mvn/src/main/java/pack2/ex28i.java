package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex28i {
	
	@Test(groups="Twoat")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
	    driver.get("http:\\www.yahoo.com");
	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
