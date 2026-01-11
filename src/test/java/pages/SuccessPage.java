package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WaitUtils.waitForUrlContains;
import static utils.WaitUtils.waitForVisibility;

public class SuccessPage extends BasePage {

    private final By alertMessageLocator= By.className("alert");

    public SuccessPage(WebDriver driver) {
        super(driver);
        // Ensure page is loaded
        waitForUrlContains(driver,"thanks");
        waitForVisibility(driver, alertMessageLocator);
    }
}
