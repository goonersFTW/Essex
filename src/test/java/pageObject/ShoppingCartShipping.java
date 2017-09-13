package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class ShoppingCartShipping {

    public WebElement shippingHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Shipping')]"));
    }

    public WebElement termsOfServiceCheckbox() {

        return Driver.findElement(By.cssSelector("input#cgv"));
    }

    public WebElement proceedToCheckoutBtn() {

        return Driver.findElement(By.cssSelector("button[name='processCarrier']"));
    }
}
