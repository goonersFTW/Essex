package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class OrderConfirmation {

    public WebElement orderConfirmationHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Order confirmation')]"));
    }

    public WebElement backToOrdersLink() {

        return Driver.findElement(By.cssSelector("a[title='Back to orders']"));
    }

}
