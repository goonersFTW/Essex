package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class Authentication {

    public String authenticationPageTitle = "Login - My Store";

    public WebElement registrationEmailField() {

        return Driver.findElement(By.cssSelector("input#email"));
    }

    public WebElement registrationPwdField() {

        return Driver.findElement(By.cssSelector("input#passwd"));
    }

    public WebElement registrationSignInBtn() {

        return Driver.findElement(By.cssSelector("button#SubmitLogin"));
    }

}
