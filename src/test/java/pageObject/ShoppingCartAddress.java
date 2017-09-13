package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class ShoppingCartAddress {

    public WebElement addressesHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Addresses')]"));
    }

    public WebElement proceedToCheckoutBtn() {

        return Driver.findElement(By.cssSelector("button[name='processAddress']"));
    }
}
