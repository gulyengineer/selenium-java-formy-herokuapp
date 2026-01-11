package stepdefinitions;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static utils.TestContext.getCurrentPage;

public class CommonSteps {

    @Then("the page header should be {string}")
    public void the_page_header_should_be(String expectedHeader) {
        String actualHeader = getCurrentPage().getHeaderText();
        assertEquals(expectedHeader, actualHeader);
    }
}
