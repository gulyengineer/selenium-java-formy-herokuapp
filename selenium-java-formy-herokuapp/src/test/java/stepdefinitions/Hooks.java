package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://formy-project.herokuapp.com/");
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
