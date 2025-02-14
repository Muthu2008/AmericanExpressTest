package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmericanExpressTest.TestPrograms.BaseClass;

public class GoldCardDescriptionpage extends BaseClass {
	@FindBy(xpath = "(//a[contains(text(),\"Demandez votre Carte\")])[1]")
	private WebElement demandezvotreCarteButton;

	
	public void SelectDemandezvotreCarteButton()
	{
		demandezvotreCarteButton.click();	
	}
	public GoldCardDescriptionpage(WebDriver driver) {
        // Initialize WebElements annotated with @FindBy
        PageFactory.initElements(driver, this);
    }


}
