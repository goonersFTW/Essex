package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class ShoppingCartPayment {

    public WebElement paymentMethodHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Please choose your payment method')]"));
    }

    public WebElement bankWirePaymentOption() {

        return Driver.findElement(By.cssSelector("a.bankwire > span"));
    }

    public WebElement chequePaymentOption() {

        return Driver.findElement(By.cssSelector("a.cheque > span"));
    }
}
