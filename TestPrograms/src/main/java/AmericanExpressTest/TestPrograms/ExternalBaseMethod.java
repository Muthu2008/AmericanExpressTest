package AmericanExpressTest.TestPrograms;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExternalBaseMethod extends BaseClass {
	public void waitForElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(element));
		until.click();

	}

	
	}

