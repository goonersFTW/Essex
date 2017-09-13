package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class OrderSummary {

    public WebElement orderSummaryHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Order summary')]"));
    }

    public WebElement confirmOrderBtn() {

        return Driver.findElement(By.xpath("//p[@id='cart_navigation']/button"));
    }
}
