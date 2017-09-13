package stepDefinition;

import cucumber.api.java.After;
import webDriver.Driver;
import common.Helpers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;


public class StepDefs {

    Helpers help = new Helpers();

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        help.goToHomePage();
    }

    @And("^I log in$")
    public void i_am_logged_in() throws Throwable {
        help.goTologinViaHomePage();
        help.login();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String item) throws Throwable {
        help.searchForItem(item);
    }

    @And("^add it to my shopping cart$")
    public void add_it_to_my_shopping_cart() throws Throwable {
        help.addSearchResultToCart();
    }

    @And("^confirm my address$")
    public void confirm_my_address() throws Throwable {
        help.confirmAddress();
    }

    @And("^choose a shipping option & accept service terms$")
    public void choose_a_shipping_option_accept_service_terms() throws Throwable {
        help.acceptTermsOfService();
    }

    @And("^choose a payment method$")
    public void choose_a_payment_method() throws Throwable {
        help.choosePaymentMethod();
    }

    @And("^confirm my order$")
    public void confirm_my_order() throws Throwable {
        help.confirmOrder();
    }

    @Then("^my order is successful$")
    public void my_order_is_successful() throws Throwable {
        help.orderIsSuccessful();
    }

    @When("^I return to my order history page$")
    public void returnToOrderHistory() throws Throwable {
        help.clickBackToOrdersLink();
    }

    @Then("^my ordered item is listed$")
    public void orderedItemIsListed() throws Throwable {
        help.orderIsListedOnHistoryPage();
    }

    @Given("^I go to the personal info page$")
    public void i_go_to_the_personal_info_page() throws Throwable {
        help.goToPersonalInfoPage();
    }

    @When("^I update my first name$")
    public void i_update_my_first_name() throws Throwable {
        help.updateFirstName();
    }

    @Then("^my update is successful$")
    public void my_update_is_successful() throws Throwable {
        help.infoUpdateSuccess();
    }

    @Then("^the first name field is updated$")
    public void the_first_name_field_is_updated() throws Throwable {
        help.firstNameIsUpdated();
    }

    @After("@one")
    public void postScenario1tearDown(){
        help.logout();
    }

    @After("@two")
    public void postScenario2tearDown(){
        help.logout();
        Driver.quit();
    }

}
