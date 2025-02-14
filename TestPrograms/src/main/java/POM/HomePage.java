package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AmericanExpressTest.TestPrograms.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath= "//button[@id='user-consent-management-granular-banner-accept-all-button']")
	public WebElement bannerOption;

	@FindBy(xpath = "//*[text()='Cartes American Express®']/../../..")
	private WebElement AmericanExpressProduct;
	
	public HomePage(WebDriver driver) {
	        // Initialize WebElements annotated with @FindBy
	//	this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	/*public WebElement getBannerOption() {
	    return bannerOption;
	}

	public void setBannerOption(WebElement bannerOption) {
	    this.bannerOption = bannerOption;
	}

	public WebElement getAmericanExpressProduct() {
	    return AmericanExpressProduct;
	}

	public void setAmericanExpressProduct(WebElement americanExpressProduct) {
	    AmericanExpressProduct = americanExpressProduct;
	}
*/
	public void selectProduct() {
	    AmericanExpressProduct.click();
	}

	public void selectBanner() { // Fixed method name
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bannerOption")));
		element.click();*/
	//	WebElement bannerOption2 = getBannerOption();
		System.out.println("display banner");
		System.out.println(bannerOption.getText());
		bannerOption.click();
		System.out.println("after banner");
		
		
		
		
	}
	
	

}
