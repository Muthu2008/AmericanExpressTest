package AmericanExpressTest.TestPrograms;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.AllcardsPage;
import POM.GoldCardDescriptionpage;
import POM.HomePage;
import POM.UserdetailsPage;

public class AmericanExpressMain extends BaseClass {

	@Test
	public void happyPath() throws InterruptedException, IOException
	{
		HomePage hp=new HomePage(driver);
		//Thread.sleep(20000);
		hp.selectBanner();
		//Thread.sleep(20000);
		hp.selectProduct();
		hp.selectBanner();
		AllcardsPage acPage=new AllcardsPage(driver);
		Thread.sleep(2000);
		acPage.selectSavoirButton();
		Thread.sleep(2000);
		GoldCardDescriptionpage gcDes=new GoldCardDescriptionpage(driver);
		Thread.sleep(2000);
		gcDes.SelectDemandezvotreCarteButton();
		Thread.sleep(2000);
		UserdetailsPage usePage=new UserdetailsPage(driver);
		FileLipMethods flpm=new FileLipMethods();
		flpm.loadProperties("C:\\Users\\muthut\\git\\repository\\TestPrograms\\src\\main\\java\\AmericanExpressTest\\TestPrograms\\External.properties");
		String fname=flpm.getProperties("Firstname");
		String lname=flpm.getProperties("Lastname");
		String dob=flpm.getProperties("Dop");
		String email=flpm.getProperties("Email");
		String no=flpm.getProperties("Phno");
		
		
		usePage.userDetails(fname, lname, dob, email, no);
		Thread.sleep(2000);
		WebElement continerButton;
		usePage.clickElementUsingJSE(usePage.continerButton);
		Thread.sleep(2000);
		usePage.userDetailsPage2();
		Thread.sleep(2000);
		usePage.clickElementUsingJSE(usePage.continerButton);
		Thread.sleep(2000);
		usePage.userDetailsPage3();
		Thread.sleep(2000);
		usePage.clickElementUsingJSE(usePage.continerButton);
		usePage.userDetailsPage4();
		hp.selectBanner();
		Thread.sleep(2000);
		usePage.userDetailsPage5();
		
	}

}
