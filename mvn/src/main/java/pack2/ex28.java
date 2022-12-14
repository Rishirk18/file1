package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex28 {
	
	@Test(groups="one")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
	    driver.get("http:\\www.google.com");
	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
