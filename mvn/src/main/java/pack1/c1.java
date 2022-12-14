package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
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



    //file=> new=> project=> maven=> maven project=> create a simple project=> groupid, artifact id=> finish
    //project=> right click=> new=> package, class=> code
    //mvnrepository.com=> selenium hq server standalone=> selenium java=> version=> copy the dependency code
    //pom.xml=> create dependencies tag=>
