package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    
	    ob.get("http://www.mycontactform.com");
	    
	    WebElement ele = ob.findElement(By.name("user"));
	    
	    Actions ac= new Actions(ob);
	    
	  //control+a=> selection
	    //control+c=> copy
	    // control+v=> pasting
	    //tab=> move to next element 
	    ac.click(ele).sendKeys("hi").build().perform();
	    
	    ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    
	    ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    
	    ac.sendKeys(Keys.TAB).build().perform();
	    
	    ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    
	    Thread.sleep(2000);
	    ob.quit();

	}

}
