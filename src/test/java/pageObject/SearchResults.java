package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

import java.util.List;

public class SearchResults {

    public WebElement searchResultsHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Search')]"));
    }

    public WebElement searchResultsCounter() {

        return Driver.findElement(By.cssSelector("span.heading-counter"));
    }


    public List<WebElement> searchResults() {

        return Driver.findElements(By.cssSelector("ul.product_list>li"));
    }

    public WebElement addSearchResultToCartBtn() {

        return Driver.findElement(By.xpath("//a/span[contains(text(),'Add to cart')]"));
    }

    public WebElement checkoutOverlay() {

        return Driver.findElement(By.cssSelector("div#layer_cart"));
    }

    public WebElement proceedToCheckoutBtn() {

        return Driver.findElement(By.xpath("//a/span[contains(text(),'Proceed to checkout')]"));
    }
}
