import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoRunner2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test
	public void test1() throws Exception
	{
		driver.get("https://www.techmahindra.com/DAVID.html");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
