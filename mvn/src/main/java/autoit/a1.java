package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		ob.findElement(By.cssSelector("#addBtn")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Java programs\\app.exe");
	}

}
