package org.buggyjusttestit.tests;


import org.buggyjusttestit.BaseTest;
import org.buggyjusttestit.pages.LoginPage;
import org.buggyjusttestit.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {




    @Test
    public void testValidLogin() {
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.login("giorgi", "Password1@");

        // check header text
        MainPage MainPage = new MainPage(driver);
        String expectedHeaderText = "Profile";
        String actualHeaderText = MainPage.GetHeaderText();
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "ტექსტი არ ემთხვევა");
    }

    @Test
    public void testLoginButtonTextColor() {
       // check login button color
        LoginPage LoginPage = new LoginPage(driver);
        String expectedColor = "rgba(255, 255, 255, 1)";
        String actualColor = LoginPage.getLoginButtonTextColor();
        Assert.assertEquals(actualColor, expectedColor, "ფერი არ ემთხვევა");

    }

}