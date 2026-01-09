package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.FormPage;
import utils.DriverManager;

import static org.junit.Assert.assertTrue;
import static utils.DriverManager.getDriver;

public class FormPageSteps {

    private FormPage formPage;

    @And("I fill in the form with the following details")
    public void iFillInTheFormWithTheFollowingDetails(DataTable dataTable) {
        formPage = new FormPage(DriverManager.getDriver());

        var data = dataTable.asMaps().get(0);
        formPage.inputFirstName(data.get("firstName"));
        formPage.inputLastName(data.get("lastName"));
        formPage.inputJobTitle(data.get("jobTitle"));
    }

    @And("I submit the form")
    public void iSubmitTheForm() {
        formPage.submitForm();
    }

    @Then("the form should be submitted successfully")
    public void theFormShouldBeSubmittedSuccessfully() {
        assertTrue(getDriver().getCurrentUrl().contains("thanks"));
    }
}
