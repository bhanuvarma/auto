package generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Result.class)
public abstract class BaseTest implements IAutoconst {
	public WebDriver driver;
	public String url=Utility.getPropertyValue(CONFIG_PATH,"URL");
	public long duration=10;
	static {
		System.setProperty( CHROME_KEY,CHROME_VALUE);
		//System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	@BeforeMethod
	public void openApplication() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod
   public void closeApplication() {
	   driver.close();
   }
	
}
