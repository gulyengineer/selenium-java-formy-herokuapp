package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WaitUtils.waitForUrlContains;
import static utils.WaitUtils.waitForVisibility;

public class FormPage extends BasePage {

    private final By formLocator = By.className("form-group");

    public FormPage(WebDriver driver) {
        super(driver);
        // Wait until the Form page is actually loaded
        waitForUrlContains(driver, "form");
        waitForVisibility(driver,formLocator);
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

    public SuccessPage submitForm() {
        waitForVisibility(driver,submitButtonLocator).click();
        return new SuccessPage(driver);
    }
}
