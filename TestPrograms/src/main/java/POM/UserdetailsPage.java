package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import AmericanExpressTest.TestPrograms.BaseClass;
import AmericanExpressTest.TestPrograms.ExternalBaseMethod;


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
	public WebElement continerButton;
	//second page
	@FindBy(id="birthName")
	public WebElement birthName;
	@FindBy(id="fieldControl-input-placeOfBirth")
	public WebElement placeofbirth;
	@FindBy(id="fieldControl-input-departmentOfBirth")
	public WebElement departmentOfBirth;
	@FindBy(id="fieldControl-input-residentialAddressLine2")
	public WebElement residentialAddressLine2;
	@FindBy(id="fieldControl-input-postcode")
	public WebElement postcode;
	@FindBy(id="fieldControl-input-cityTown")
	public WebElement cityTown;
	@FindBy(id="fieldControl-input-personalResidentialStatus")
	public WebElement personalResidentialStatus;
	
	//third page
	@FindBy(id="fieldControl-input-bankAccountNumber")//GB29 NWBK 6016 1331 9268 19
	public WebElement bankAccountNumber;
	public WebElement bankIdentifierCode;
//drop
	@FindBy(id="fieldControl-input-tenureOfAccount")//index 2
	public WebElement tenureOfAccount;
	@FindBy(id="fieldControl-input-annualPersonalIncome")//20000
	public WebElement annualPersonalIncome;
	@FindBy(xpath="//input[@id=\"hasAdditionalIncome1-NO\"]/following-sibling::label")
	public WebElement hasAdditionalIncome;
	
	//drop
	@FindBy(id="fieldControl-input-totalAssets")
	public WebElement totalAssets;//index 2
	@FindBy(id="fieldControl-input-occupation")
	public WebElement occupation;//index 3
	@FindBy(id="fieldControl-input-occupationDescription")
	public WebElement occupationDescription;
	
	@FindBy(id="fieldControl-input-sirenNumber")
	public WebElement sirenNumber;
	
	@FindBy(id="fieldControl-input-employerName")
	public WebElement employerName;
	@FindBy(id="fieldControl-input-employmentDuration")
	public WebElement employmentDuration;
	//page4
	
	@FindBy(id="fieldControl-input-mothersMaidenName")
	public WebElement mothersMaidenName;
	@FindBy(id="fieldControl-input-pin")
	public WebElement pin;
	@FindBy(id="fieldControl-input-confirmPin")
	public WebElement confirmPin;
	//input[@id="fieldControl-input-otherAmexCard"]/following-sibling::label
	@FindBy(xpath="//input[@id=\"fieldControl-input-otherAmexCard\"]/following-sibling::label")
	public WebElement otherAmexCard;
	
	@FindBy(xpath="//input[@id=\"marketingEmailPreferences-false\"]/following-sibling::label")
	public WebElement marketingEmailPreferences;
	@FindBy(xpath="//input[@id=\"marketingSMSPhonePostalPreferences-OPT_OUT\"]/following-sibling::label")
	public WebElement marketingSMSPhonePostalPreferences;
	
	@FindBy(xpath="//button[text()=\"Soumettre\"]")
	public WebElement SoumettreButton ;
	@FindBy(xpath="//button[text()=\"Continuer\"]")
	public WebElement ContinuerButton ;
	
	//page 5
	@FindBy(xpath="//input[@id=\"checkbox-1\"]/following-sibling::label")
	public WebElement checkbox1;
	@FindBy(id="cuf")
	public WebElement cufbox;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public UserdetailsPage(WebDriver driver) {
        // Initialize WebElements annotated with @FindBy
		this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    
	
	
	public void userDetails(String fname,String lname,String dop,String nemail,String phonenum)
	{
		radioButton.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		dob.sendKeys(dop);
		email.sendKeys(nemail);
		phoneNo.sendKeys(phonenum);	
		
	}
	public void userDetailsPage2()
	{
		birthName.sendKeys("Muthu");
		placeofbirth.sendKeys("Sivakasi");
		selectByIntex(departmentOfBirth, 2);
		residentialAddressLine2.sendKeys("80 pallavan nagar");
		postcode.sendKeys("04543");
		cityTown.sendKeys("Injampakkam");
		selectByIntex(personalResidentialStatus, 2);	
	}
	public void userDetailsPage3() throws InterruptedException
	{
		bankAccountNumber.sendKeys("GB29 NWBK 6016 1331 9268 19");
		bankIdentifierCode.sendKeys("NWBKGB2LXXX");
		selectByIntex(tenureOfAccount, 3);
		annualPersonalIncome.sendKeys("20000");
		Thread.sleep(2000);
		clickElementUsingJSE(hasAdditionalIncome);
		
		//hasAdditionalIncome.click();
		selectByIntex(totalAssets, 3);
		selectBytext(occupation, "Agriculteurs exploitants");
		selectBytext(occupationDescription, "Agriculteur exploitant");
		sirenNumber.sendKeys("000000000");
		employerName.sendKeys("capgemini");
		selectByIntex(employmentDuration, 3);
		
			
	}
	public void userDetailsPage4() throws InterruptedException
	{
		mothersMaidenName.sendKeys("roja");
		pin.sendKeys("1234");
		confirmPin.sendKeys("1234");
		//otherAmexCard.click();
		clickElementUsingJSE(marketingEmailPreferences);
		clickElementUsingJSE(marketingSMSPhonePostalPreferences);
		clickElementUsingJSE(SoumettreButton);
		Thread.sleep(2000);
		ContinuerButton.click();
		cufbox.sendKeys("1234");
		
		
		
	}
	public void userDetailsPage5() 
	{
		checkbox1.click();	
	}
	
	



	public void selectContinourButton() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		Robot robot=new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("cliked no thanks Button");
		
		
		ExternalBaseMethod exbm=new ExternalBaseMethod();			
		exbm.waitForElementClickable(continerButton);
		continerButton.click();
		
		
	}
	
	public void clickElementUsingJSE(WebElement element )
	
	{
		 if (driver == null) {
		        System.out.println("Driver not initialized!");
		        return;
		    }

		    if (element == null) {
		        System.out.println("Element not found!");
		        return;
		    }
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void selectBytext(WebElement element,String text)
	{
		Select sct=new Select(element);
		sct.selectByVisibleText(text);
	}
	public void selectByIntex(WebElement element,int intex)
	{
		Select sct=new Select(element);
		sct.selectByIndex(intex);
	}
}
