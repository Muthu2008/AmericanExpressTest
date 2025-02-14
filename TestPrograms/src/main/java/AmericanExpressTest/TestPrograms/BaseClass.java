package AmericanExpressTest.TestPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	
   public WebDriver driver;
	@BeforeMethod
	public void lanchpage()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
    	driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void TearDown()
	{
		//driver.quit();
	}
	

}
