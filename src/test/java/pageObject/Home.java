package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class Home {

    public String homePageTitle = "My Store";

    public WebElement contactUsButton() {

        return Driver.findElement(By.id("contact-link"));
    }

    public WebElement loginButton() {

        return Driver.findElement(By.cssSelector("a.login"));
    }

    public WebElement googleSearchButton() {

        return Driver.findElement(By.name("btnG"));
    }
}
