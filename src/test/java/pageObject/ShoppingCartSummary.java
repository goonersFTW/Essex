package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class ShoppingCartSummary {

    public WebElement summaryHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Shopping-cart summary')]"));
    }

    public WebElement proceedToCheckoutBtn() {

        return Driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span"));
    }



}
