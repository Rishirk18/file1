package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ex27 {
	
	@Test
	public void ex() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    
	    //visit
	    ob.get("http://www.google.com");
	    
	    WebElement ele = ob.findElement(By.className("gb_d"));
	    
	    Actions ac= new Actions(ob);
	    
	    File f = ob.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("C:\\Users\\admin\\eclipse-workspace\\mvn\\screenshots\\before1"));
	    
	    ac.click(ele).build().perform();
	    
	    File f1 = ob.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("C:\\Users\\admin\\eclipse-workspace\\mvn\\screenshots\\after1"));
	}

}
