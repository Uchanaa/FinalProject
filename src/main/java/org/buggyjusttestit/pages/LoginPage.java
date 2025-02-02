package org.buggyjusttestit.pages;

import org.buggyjusttestit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    public  LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;



     @FindBy(xpath = "//img[@title='Lamborghini']")
     WebElement popularMake;

    public void login(String username, String password) {

        enterText(usernameField, username);
        enterText(passwordField, password);
        clickToElementWithWait(loginButton);

    }

    public String getLoginButtonTextColor() {
        return getCssValue(loginButton, "color");
    }


    public boolean isLoginButtonVisible(){
        return loginButton.isDisplayed();
    }


}

