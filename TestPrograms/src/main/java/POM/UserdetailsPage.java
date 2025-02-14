package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AmericanExpressTest.TestPrograms.BaseClass;


public class UserdetailsPage extends BaseClass   {
	@FindBy(xpath="//span[contains(text(),\"M.\")]/..")
	private WebElement radioButton;
	@FindBy(id="fieldControl-input-firstName")
	private WebElement firstName;
	@FindBy(id="fieldControl-input-lastName")
	private WebElement lastName;
	@FindBy(id="fieldControl-input-dateOfBirth")
	private WebElement dob;
	@FindBy(id="fieldControl-input-email")
	private WebElement email;
	@FindBy(id="fieldControl-input-mobilePhoneNumber")
	private WebElement phoneNo;
	@FindBy(xpath="//button[contains(text(),'Sauvegarder et Continuer')]")
	private WebElement continerButton;
	
	
	public UserdetailsPage(WebDriver driver) {
        // Initialize WebElements annotated with @FindBy
        PageFactory.initElements(driver, this);
    }

    
	
	
	public void userDetails(String fname,String lname,String dop,String nemail,String phonenum)
	{
		radioButton.click();
		firstName.sendKeys("fname");
		lastName.sendKeys("lname");
		dob.sendKeys("dop");
		email.sendKeys("nemail");
		phoneNo.sendKeys("phonenum");	
		
	}
	
	



	public void selectContinourButton() throws InterruptedException {
		Thread.sleep(2000);
		continerButton.click();
		
	}
	
}
