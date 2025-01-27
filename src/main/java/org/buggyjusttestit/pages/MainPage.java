package org.buggyjusttestit.pages;

import org.buggyjusttestit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) { super (driver); }

    @FindBy(xpath = "//a[normalize-space()='Profile']")
    WebElement HeaderText;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement  logoutButton;

    public String GetHeaderText(){
        waitForElementToBeVisible(HeaderText);
        return getElementText(HeaderText);

    }

    public void clickLogout(){
        waitUntilElementToBeClickable(logoutButton);
        logoutButton.click();
    }

}
