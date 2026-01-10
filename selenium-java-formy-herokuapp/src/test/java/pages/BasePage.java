package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public abstract class BasePage {

    protected final WebDriver driver;

    private final By pageHeader = By.tagName("h1");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        return WaitUtils.waitForVisibility(driver, pageHeader).getText();
    }
}
