package pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c4 {
	
	@Test(groups="Two")
	public void t4() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    
	    //visit
	    ob.get("http://courses.letskodeit.com/practice");
	    
	    List<WebElement> w = ob.findElements(By.xpath("//*[@name='cars' and @type='radio']"));
	    
	    //for(datatype tempvar : nameofthecollection)
	    for(WebElement x:w)
	    {
	    	x.click();
	    	Thread.sleep(3000);
	    }
	    ob.quit();
	}

}
