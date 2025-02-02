package org.buggyjusttestit.tests;


import org.buggyjusttestit.BaseTest;
import org.buggyjusttestit.data.LoginTestData;
import org.buggyjusttestit.pages.LoginPage;
import org.buggyjusttestit.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.buggyjusttestit.data.LoginTestData.*;


public class LoginTest extends BaseTest {




    @Test
    public void testValidLogin() {
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.login(LoginTestData.USERNAME,LoginTestData.PASSWORD);

        // check header text
        MainPage MainPage = new MainPage(driver);
        String expectedHeaderText = LoginTestData.EXPECTED_HEADER_TEXT;
        String actualHeaderText = MainPage.GetHeaderText();
        Assert.assertEquals(actualHeaderText, expectedHeaderText, LoginTestData.ERROR_MESSAGE);
    }

    @Test
    public void testLoginButtonTextColor() {
        // check login button color
        LoginPage LoginPage = new LoginPage(driver);
        String expectedColor = LoginTestData.EXPECTED_BUTTON_COLOR;
        String actualColor = LoginPage.getLoginButtonTextColor();
        Assert.assertEquals(actualColor, expectedColor, LoginTestData.WRONG_COLOR);

    }




}