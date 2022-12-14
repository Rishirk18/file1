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

public class c2 {
	
	@Test(groups="one")
	public void t2 () throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    
	    //visit
	    ob.get("https://jqueryui.com/droppable/");
	    
	    File f = ob.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("C:\\Users\\admin\\eclipse-workspace\\mvn\\screenshots\\before"));
	    
	    // webelements: present inside a frame
	    // switch your control to that frame
	    // id, name, index
	   ob.switchTo().frame(0);
	   Actions ac= new Actions(ob);
	   WebElement ele1 = ob.findElement(By.id("draggable"));
	   WebElement ele2 = ob.findElement(By.id("droppable"));
	   
	   ac.dragAndDrop(ele1, ele2).build().perform();
	   File f1 = ob.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(f, new File("C:\\Users\\admin\\eclipse-workspace\\mvn\\screenshots\\after"));
	   Thread.sleep(3000);
	   ob.quit();
	}

}
