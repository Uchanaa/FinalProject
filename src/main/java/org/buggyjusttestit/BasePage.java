package org.buggyjusttestit;

import jdk.jshell.execution.Util;
import org.buggyjusttestit.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void enterText(WebElement locator, String text) {
        waitUntilElementToBeClickable(locator);
        locator.sendKeys(text);
        Utils.log("მოვძებნე ელემენტი: [ " + locator + "] გადავეცი ტექსტი " + text);
    }

    public String getElementText(WebElement locator) {
        waitForElementToBeVisible(locator);
        return locator.getText();

    }
    public void waitUntilElementToBeClickable(WebElement locator) {
        Utils.log("ველოდები რომ ელემენტი " + locator + "გახდეს დაკლიკებადი");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Utils.log("ვიპოვე ელემენტი [ " + locator + "]");
    }
    public void clickToElement(WebElement locator) {
        locator.click();
        Utils.log("დავაკლიკე [ " + locator + " ] -ზე");
    }

    public void clickToElementWithWait(WebElement locator) {
        waitUntilElementToBeClickable(locator);
        clickToElement(locator);
    }
    public void waitForElementToBeVisible(WebElement locator) {
        Utils.log("ველოდები რომ ელემენტი [ " + locator + " ] გამოჩნდეს");
        wait.until(ExpectedConditions.visibilityOf(locator));
        Utils.log("ელემენტი [ " + locator + " ] გამოჩნდა");
    }

    public String getCssValue(WebElement locator, String propertyName) {
        waitForElementToBeVisible(locator);
        return locator.getCssValue(propertyName);
    }
}