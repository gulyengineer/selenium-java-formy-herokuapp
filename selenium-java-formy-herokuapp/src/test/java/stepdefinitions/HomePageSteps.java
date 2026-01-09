package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverManager;

import static org.junit.Assert.assertEquals;

public class HomePageSteps {

    private HomePage homePage;

    @Given("I am on the Formy home page")
    public void iAmOnTheFormyHomePage() {
        WebDriver driver = DriverManager.getDriver();
        homePage = new HomePage(driver);
    }

    @Then("the page header should be {string}")
    public void thePageHeaderShouldBe(String expectedHeader) {
        assertEquals(expectedHeader, homePage.getHeaderText());
    }

    @When("I navigate to the Complete Web Form page")
    public void iNavigateToTheCompleteWebFormPage() {
        homePage.navigateToFormPage();
    }
}
