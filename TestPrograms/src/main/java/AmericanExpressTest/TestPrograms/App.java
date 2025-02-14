package AmericanExpressTest.TestPrograms;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App {

    public static void main(String[] args) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
    	//driver.get("https://www.americanexpress.com/fr-fr/charge-cards/apply/personal/gold?sourcecode=A0000FE43V&intlink=fr-amex-cardshop-details-apply-GoldCardAmericanExpress-siderail");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.findElement(By.xpath("//button[@id=\"user-consent-management-granular-banner-accept-all-button\"]")).click();
    	driver.findElement(By.xpath("//*[text()=\"Cartes American Express®\"]/../../..")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[@id=\"user-consent-management-granular-banner-accept-all-button\"]")).click();
    	driver.findElement(By.xpath("(//a[@title=\"Carte Gold American Express\"])[1]/../../../..//a/span[text()=\"En savoir plus\"]/..")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//a[contains(text(),\"Demandez votre Carte\")])[1]")).click();
    	Thread.sleep(2000);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[contains(text(),\"M.\")]/..")).click();
    	driver.findElement(By.id("fieldControl-input-firstName")).sendKeys("Muthukumar");
    	driver.findElement(By.id("fieldControl-input-lastName")).sendKeys("Tm");
    	driver.findElement(By.id("fieldControl-input-dateOfBirth")).sendKeys("20/08/1989");
    	driver.findElement(By.id("fieldControl-input-email")).sendKeys("muthu123@gamil.com");
    	driver.findElement(By.id("fieldControl-input-mobilePhoneNumber")).sendKeys("0636453746");
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),\\\"Sauvegarder et Continuer\\\")]")));
    	element.click();
    	
    	
    	
    	
    }
}
