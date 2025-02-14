package AmericanExpressTest.TestPrograms;

import org.testng.annotations.Test;

import POM.AllcardsPage;
import POM.GoldCardDescriptionpage;
import POM.HomePage;
import POM.UserdetailsPage;

public class AmericanExpressMain extends BaseClass {

	@Test
	public void happyPath() throws InterruptedException
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
		usePage.userDetails("muthukumar", "Ta", "20/08/1989", "muthu123@gmail.com", "07462748374");
		Thread.sleep(2000);
		usePage.selectContinourButton();
				
	}

}
