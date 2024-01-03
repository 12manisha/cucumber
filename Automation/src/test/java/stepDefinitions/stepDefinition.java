package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class stepDefinition {

    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_landing_page() {
        System.out.println("User is on NetBanking landing page");
        // Add code to navigate to the NetBanking landing page
    }

    @When("User login application with {string} and {string}")
    public void user_login_application_with_username_and_password(String username, String password) {
        // Add code to perform the login action with username and password
        System.out.println("User logs in with username: " + username + " and password: " + password);
        // You can use the 'username' and 'password' variables in your login process
    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
        System.out.println("Home page is populated");
        // Add code to validate that the home page is populated
    }

    @And("Cards displayed are {string}")
    public void cards_displayed_are(String tf) {
        System.out.println("Cards displayed are "+tf + "\n");
        // Add code to validate that cards are displayed on the home page
    }
}
