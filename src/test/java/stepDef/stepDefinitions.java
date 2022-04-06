package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import resource.base;
import pageObjects.login;

import java.io.IOException;

public class stepDefinitions extends base {
    @Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver = initializeDriver();
    }

    @Given("Navigate to {string} Site")
    public void navigate_to_site(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(string);
    }

    @Then("Verify that user is successfully logged in")
    public void verify_that_user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.getTitle().equals("Swag Labs"));

    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
        login lp=new login(driver);
        lp.getEmail().sendKeys(username);
        lp.getPassword().sendKeys(password);
        lp.getLogin().click();
    }


    @Then("close browsers")
    public void close_browsers() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

    @Then("Verify that user is unable to log in")
    public void verify_that_user_is_unable_to_log_in() {
        // Write code here that turns the phrase above into concrete actions
        boolean flag = true;
        String a = "";
        String b = "";
        String c = "";
        if(a==driver.findElement(By.xpath("//*[@data-test='error']")).getText()
                || b == driver.findElement(By.xpath("//*[@data-test='error']")).getText() ||
                c == driver.findElement(By.xpath("//*[@data-test='error']")).getText()){
            flag=false;
        }
        Assert.assertFalse(flag);
    }


}
