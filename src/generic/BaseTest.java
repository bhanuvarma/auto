package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static {
		System.setProperty("webDriver.chrome.driver","./driver/chromeDriver.exe");
	}
	WebDriver driver;
	public void openApplication() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
	}
   public void closeApplication() {
	   driver.close();
   }
}
