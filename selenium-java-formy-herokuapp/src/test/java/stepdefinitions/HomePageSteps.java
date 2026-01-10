package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.FormPage;
import pages.HomePage;

import static org.junit.Assert.assertTrue;
import static utils.DriverManager.getDriver;
import static utils.TestContext.setCurrentPage;

public class HomePageSteps {

    private HomePage homePage;

    @Given("I am on the Formy home page")
    public void iAmOnTheFormyHomePage() {
        homePage = new HomePage(getDriver());
        setCurrentPage(homePage);
        assertTrue(getDriver().getCurrentUrl().contains("formy-project"));
    }

    @When("I navigate to the Complete Web Form page")
    public void iNavigateToTheCompleteWebFormPage() {
        homePage.navigateToFormPage();
        setCurrentPage(new FormPage(getDriver()));
    }
}
