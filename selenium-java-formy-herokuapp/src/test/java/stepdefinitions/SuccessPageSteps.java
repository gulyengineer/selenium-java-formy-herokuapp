package stepdefinitions;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

import static utils.DriverManager.getDriver;
import static utils.TestContext.getCurrentPage;
import static utils.WaitUtils.waitForUrlContains;

public class SuccessPageSteps {

    @Then("the form should be submitted successfully")
    public void theFormShouldBeSubmittedSuccessfully() {
        waitForUrlContains(getDriver(), "thanks");
        assertEquals("Thanks for submitting your form", getCurrentPage().getHeaderText());
    }
}
