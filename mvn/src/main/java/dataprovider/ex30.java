package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex30 {
	
	@Parameters({"VEMAIL","VPASS"}) //VUSER=u  VPASS=v
	@Test
	public void t1(String u,String v)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    
	    //visit
	    ob.get("http://www.facebook.com");
	    
	    ob.findElement(By.id("email")).sendKeys(u);
	    
	    ob.findElement(By.name("pass")).sendKeys(v);
	    

	    
	    ob.findElement(By.name("login")).click();

}
}
