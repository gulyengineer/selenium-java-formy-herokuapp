package stepdefinitions;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

import static utils.TestContext.getCurrentPage;

public class SuccessPageSteps {

    @Then("the form should be submitted successfully")
    public void theFormShouldBeSubmittedSuccessfully() {
        assertEquals("Thanks for submitting your form", getCurrentPage().getHeaderText());
    }
}
