package org.buggyjusttestit.tests;
import org.buggyjusttestit.BaseTest;
import org.buggyjusttestit.data.MainTestData;
import org.buggyjusttestit.pages.LoginPage;
import org.buggyjusttestit.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest extends BaseTest {




    @Test
    public void testLogout() {
        // check logout
        MainPage MainPage = new MainPage(driver);
        MainPage.clickLogout();
        LoginPage LoginPage = new LoginPage(driver);
        boolean isLoginButtonVisible = LoginPage.isLoginButtonVisible();
        Assert.assertTrue(isLoginButtonVisible, MainTestData.LOGOUT_ERROR_MESSAGE);

    }
}

