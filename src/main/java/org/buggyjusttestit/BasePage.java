package org.buggyjusttestit;

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
    }
    public void clickElement(WebElement locator) {
        waitUntilElementToBeClickable(locator);
        locator.click();
    }
    public String getElementText(WebElement locator) {
        return locator.getText();
    }
    public void waitUntilElementToBeClickable(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void waitForElementToBeClickable(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void clickToElementWithWait(WebElement locator) {
        waitForElementToBeClickable(locator);
        locator.click();
    }
    public void waitForElementToBeVisible(WebElement locator) {
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public String getCssValue(WebElement locator, String propertyName) {
        waitForElementToBeVisible(locator);
        return locator.getCssValue(propertyName);
    }
}