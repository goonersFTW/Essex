package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class OrderHistory {

    public WebElement orderHistoryHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Order history')]"));
    }

    public WebElement latestOrder() {

        return Driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr/td/a"));
    }

    public WebElement latestOrderedItemDetail() {

        return Driver.findElement(By.xpath("//div[@id='order-detail-content']/table/tbody/tr/td[2]/label"));
    }
}
