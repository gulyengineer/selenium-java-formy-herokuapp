package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By pageHeader = By.tagName("h1");

    private By formLink = By.linkText("Complete Web Form");
    private By dropdownLink = By.linkText("Dropdown");
    private By autocompleteLink = By.linkText("Autocomplete");

    // Actions
    public String getHeaderText() {
        return driver.findElement(pageHeader).getText();
    }

    public void navigateToFormPage() {
        driver.findElement(formLink).click();
    }

    public void navigateToDropdownPage() {
        driver.findElement(dropdownLink).click();
    }

    public void navigateToAutocompletePage() {
        driver.findElement(autocompleteLink).click();
    }
}
