package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pages.FormPage;
import pages.SuccessPage;

import static utils.DriverManager.getDriver;
import static utils.TestContext.getCurrentPage;
import static utils.TestContext.setCurrentPage;

public class FormPageSteps {

    private FormPage formPage;

    @And("I fill in the form with the following details")
    public void iFillInTheFormWithTheFollowingDetails(DataTable dataTable) {
        formPage = (FormPage) getCurrentPage();
        var data = dataTable.asMaps().get(0);
        formPage.inputFirstName(data.get("firstName"));
        formPage.inputLastName(data.get("lastName"));
        formPage.inputJobTitle(data.get("jobTitle"));
    }

    @And("I submit the form")
    public void iSubmitTheForm() {
        formPage.submitForm();
        setCurrentPage(new SuccessPage(getDriver()));
    }
}
