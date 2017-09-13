package common;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import pageObject.*;
import webDriver.Driver;

public class Helpers {

    Home home = new Home();
    Authentication auth = new Authentication();
    MyAccount acc = new MyAccount();
    SearchResults results = new SearchResults();
    ShoppingCartSummary summ = new ShoppingCartSummary();
    ShoppingCartAddress add = new ShoppingCartAddress();
    ShoppingCartShipping ship = new ShoppingCartShipping();
    ShoppingCartPayment pay = new ShoppingCartPayment();
    OrderSummary order = new OrderSummary();
    OrderConfirmation confirm = new OrderConfirmation();
    OrderHistory hist = new OrderHistory();
    PersonalInfo info = new PersonalInfo();

    String username = "auto@mail.com";
    String updatedFirstname = nameGenerator();
    String password = "123456";
    String searchItem;
    String itemDetail;

    public void goToHomePage() {
        Driver.goToHomePage();
        Assert.assertTrue(Driver.getTitle().contains(home.homePageTitle));
    }

    public void goTologinViaHomePage() {
        home.loginButton().click();
        Assert.assertTrue(Driver.getTitle().contains(auth.authenticationPageTitle));
    }

    public void goToPersonalInfoPage() {
        acc.personalInfoButton().click();
        Assert.assertTrue(info.personalInformationHeader().isDisplayed());
    }

    public void login() {
        auth.registrationEmailField().sendKeys(username);
        auth.registrationPwdField().sendKeys(password);
        auth.registrationSignInBtn().click();
        Assert.assertTrue(Driver.getTitle().contains(acc.myAccountPageTitle));
    }

    public void logout() {
        acc.logoutBtn().click();
        Assert.assertTrue(Driver.getTitle().contains(home.homePageTitle));
    }

    public void searchForItem(String item) {
        searchItem = item;
        acc.myAccountSearchField().clear();
        acc.myAccountSearchField().sendKeys(item);
        acc.submitSearchBtn().click();
        Assert.assertTrue(results.searchResultsHeader().isDisplayed());
        Assert.assertTrue(results.searchResultsCounter().isDisplayed());
    }

    public void addSearchResultToCart(){
        List<WebElement> resultList = results.searchResults();
        Iterator<WebElement> program = resultList.iterator();
        while (program.hasNext()) {
            WebElement firstResult = program.next();
            itemDetail = firstResult.getText().substring(0, 27);
            Driver.hoverAndClick(firstResult, results.addSearchResultToCartBtn());
        }
        Assert.assertTrue(results.checkoutOverlay().isDisplayed());
        results.proceedToCheckoutBtn().click();
        Assert.assertTrue(summ.summaryHeader().isDisplayed());
        summ.proceedToCheckoutBtn().click();
    }

    public void confirmAddress(){
        Assert.assertTrue(add.addressesHeader().isDisplayed());
        add.proceedToCheckoutBtn().click();
    }

    public void acceptTermsOfService(){
        Assert.assertTrue(ship.shippingHeader().isDisplayed());
        ship.termsOfServiceCheckbox().click();
        ship.proceedToCheckoutBtn().click();
    }

    public void choosePaymentMethod(){
        Assert.assertTrue(pay.paymentMethodHeader().isDisplayed());
        pay.bankWirePaymentOption().click();
    }

    public void confirmOrder(){
        Assert.assertTrue(order.orderSummaryHeader().isDisplayed());
        order.confirmOrderBtn().click();
    }

    public void orderIsSuccessful(){
        Assert.assertTrue(confirm.orderConfirmationHeader().isDisplayed());
    }

    public void clickBackToOrdersLink(){
        confirm.backToOrdersLink().click();
        Assert.assertTrue(hist.orderHistoryHeader().isDisplayed());
    }

    public void orderIsListedOnHistoryPage() throws InterruptedException{
        hist.latestOrder().click();
        Thread.sleep(2000);
        Assert.assertTrue(hist.latestOrderedItemDetail().getText().contains(itemDetail));
    }

    public void updateFirstName(){
        info.firstNameField().clear();
        info.firstNameField().sendKeys(updatedFirstname);
        info.currentPwdField().sendKeys(password);
        info.saveBtn().click();
    }

    public void infoUpdateSuccess(){
        Assert.assertTrue(info.updateSuccessMessage().isDisplayed());
    }

    public void goToAccPageFromPersonalInfo(){
        info.backToAccountLink().click();
        acc.personalInfoButton().click();
    }

    public void firstNameIsUpdated(){
        info.backToAccountLink().click();
        goToPersonalInfoPage();
        updatedFirstname = Character.toUpperCase(updatedFirstname.charAt(0)) + updatedFirstname.substring(1);
        Assert.assertTrue(info.firstNameField().getAttribute("value").equalsIgnoreCase(updatedFirstname));
    }

    private String nameGenerator(){
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String a = "";
        Random random = new Random();
        int nameLength = 1+random.nextInt(9);
        for (int i = 0; i < nameLength; i++) {
            char c = alphabet.charAt(random.nextInt(26));
            a+=c;
        }
        return a;
    }

}
