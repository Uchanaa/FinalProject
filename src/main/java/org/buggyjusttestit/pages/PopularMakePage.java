package org.buggyjusttestit.pages;

import org.buggyjusttestit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopularMakePage extends BasePage {
    public PopularMakePage(WebDriver driver) { super (driver); }


    @FindBy(xpath = "//img[@title='Lamborghini']")
    WebElement popularMakeLogo;


    public void clickPopularMakeButton(){
        clickToElementWithWait(popularMakeLogo);
    }


    public void checkLamboLogo() {
        waitForElementToBeVisible(popularMakeLogo);
        // შემოწმება, ჩანს თუ არა ლოგო
        if (popularMakeLogo.isDisplayed()) {
            System.out.println("Lamborghini logo is displayed.");
        } else {
            throw new AssertionError("Lamborghini logo is not displayed!");
        }
    }

}
