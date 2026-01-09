package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WaitUtils.waitForVisibility;

public class FormPage {

    private final WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By firstNameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");
    private final By jobTitleLocator = By.id("job-title");
    private  final By submitButtonLocator = By.cssSelector("a.btn.btn-lg.btn-primary");

    // Actions
    public void inputFirstName(String firstName) {
        waitForVisibility(driver, firstNameLocator).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        waitForVisibility(driver,lastNameLocator).sendKeys(lastName);
    }

    public void inputJobTitle(String jobTitle) {
        waitForVisibility(driver,jobTitleLocator).sendKeys(jobTitle);
    }

    public void submitForm() {
        waitForVisibility(driver,submitButtonLocator).click();
    }
}
