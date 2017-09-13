package webDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;


public class Driver {

    public static WebDriver driver;
    private static final int h = 1400;
    private static final int w = 900;

    //ChromeDriver will need to be added user's PATH
    public synchronized static WebDriver getChromeDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(h, w));
        }
        return driver;
    }

    public static void quit() {
        getChromeDriver().quit();
    }

    public static void close() {
        getChromeDriver().close();
    }


    public static void goToHomePage(){
        getChromeDriver().get("http://automationpractice.com");
    }

    public static void loadPage(String url) {
        getChromeDriver().get(url);
    }

    public static WebElement findElement(By element) {
        try {
            new WebDriverWait(getChromeDriver(), 10).until(ExpectedConditions.visibilityOfElementLocated((By) element));
            new WebDriverWait(getChromeDriver(), 10).until(ExpectedConditions.elementToBeClickable((By) element));
        } catch (Exception e) {

        }
        WebElement foundElement;

        try {
            foundElement = getChromeDriver().findElement(element);
        } catch (Exception e) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println("Waiting 5 seconds.");
            foundElement = getChromeDriver().findElement(element);
        }
        return foundElement;
    }

    public static List<WebElement> findElements(By element) {

        try {
            new WebDriverWait(getChromeDriver(), 10).until(ExpectedConditions
                    .presenceOfAllElementsLocatedBy((By) element));
        }
        catch (TimeoutException e)
        {
            System.out.println("Supressed: " + e.getMessage());
        }
        return getChromeDriver().findElements(element);

    }

    public static Boolean waitForUrlToContain(String url, int time) {
        return new WebDriverWait(getChromeDriver(), time).until(ExpectedConditions.urlContains(url));
    }

    public static String getCurrentUrl() {
        return getChromeDriver().getCurrentUrl();
    }

    public static String getTitle() {
        return getChromeDriver().getTitle();
    }

    public static Actions actions()
    {
        return new Actions(getChromeDriver());
    }


    public static void dragAndDrop(WebElement start, WebElement finish)
    {
        Driver.actions().moveToElement(finish).perform();
        Driver.actions().moveToElement(start).perform();
        Driver.actions().clickAndHold(start).perform();
        Driver.actions().moveToElement(finish).perform();
        Driver.actions().moveToElement(finish).perform();
        Driver.actions().release(finish).perform();
    }

    public static void hoverAndClick(WebElement first, WebElement second) {
        Driver.actions().moveToElement(first).build().perform();
        second.click();
    }



}

