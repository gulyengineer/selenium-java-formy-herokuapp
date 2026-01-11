package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators

    private final By formLink = By.linkText("Complete Web Form");
    private final By dropdownLink = By.linkText("Dropdown");
    private final By autocompleteLink = By.linkText("Autocomplete");

    // Actions
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
