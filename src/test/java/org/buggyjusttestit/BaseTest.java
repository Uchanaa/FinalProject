package org.buggyjusttestit;


import org.buggyjusttestit.pages.LoginPage;
import org.buggyjusttestit.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://buggy.justtestit.org");

        if (!this.getClass().getSimpleName().equals("LoginTest")) {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("giorgi", "Password1@");
        }
    }



    //@AfterMethod
    //public void tearDown() {
     //   DriverManager.quit();
   // }
}
