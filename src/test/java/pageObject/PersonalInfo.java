package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

public class PersonalInfo {

    public WebElement personalInformationHeader() {

        return Driver.findElement(By.xpath("//h1[contains(text(),'Your personal information')]"));
    }

    public WebElement firstNameField() {

        return Driver.findElement(By.cssSelector("input#firstname"));
    }

    public WebElement currentPwdField() {

        return Driver.findElement(By.cssSelector("input#old_passwd"));
    }

    public WebElement saveBtn() {

        return Driver.findElement(By.cssSelector("button[name='submitIdentity']"));
    }

    public WebElement updateSuccessMessage() {

        return Driver.findElement(By.xpath("//p[contains(text(),'Your personal information has been successfully updated.')]"));
    }

    public WebElement backToAccountLink() {

        return Driver.findElement(By.cssSelector("ul.footer_links>li>a"));
    }
}
