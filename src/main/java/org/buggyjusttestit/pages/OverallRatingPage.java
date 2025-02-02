package org.buggyjusttestit.pages;

import org.buggyjusttestit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverallRatingPage extends BasePage {
        public OverallRatingPage(WebDriver driver) {
        super(driver);}


    @FindBy(xpath = "//img[@src='/img/overall.jpg']")
    WebElement overallrating;


    public void clickOverallRatingButton(){
        clickToElementWithWait(overallrating);
    }



}

