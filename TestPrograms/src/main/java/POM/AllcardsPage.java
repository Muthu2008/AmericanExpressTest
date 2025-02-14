package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AmericanExpressTest.TestPrograms.BaseClass;

public class AllcardsPage extends BaseClass {
	@FindBy(xpath="(//a[@title=\"Carte Gold American Express\"])[1]/../../..//a/span[text()=\"En savoir plus\"]/..")
	 public WebElement selectEnsavoirplusButton;

	public void selectSavoirButton()
	{
		selectEnsavoirplusButton.click();
	}
	

	public AllcardsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
	}
}
