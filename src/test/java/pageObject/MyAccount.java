package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class MyAccount {

    public String myAccountPageTitle = "My account - My Store";

    public WebElement userName() {

        return Driver.findElement(By.cssSelector("a.account>span"));
    }

    public WebElement logoutBtn() {

        return Driver.findElement(By.cssSelector("a.logout"));
    }

    public WebElement myAccountSearchField() {

        return Driver.findElement(By.cssSelector("input#search_query_top"));
    }

    public WebElement submitSearchBtn() {

        return Driver.findElement(By.name("submit_search"));
    }

    public WebElement personalInfoButton() {

        return Driver.findElement(By.cssSelector("a[title=\"Information\"]>span"));
    }

}
