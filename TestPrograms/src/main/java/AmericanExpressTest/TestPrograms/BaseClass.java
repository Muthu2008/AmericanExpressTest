package AmericanExpressTest.TestPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-save-password-bubble");
		options.setExperimentalOption("prefs", new java.util.HashMap<String , Object>()
				{{
					put("profile.password_manager_enabled", false);
					put("credentials_enable_service",false);
					put("autofill.profile_enabled",false);
				}});
		
		options.addArguments("--disable-features=PasswordManager,Autofill");
        options.addArguments("--disable-infobars"); 
		driver=new ChromeDriver(options);
    	driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void TearDown()
	{
	//	driver.quit();
	}
	

}
