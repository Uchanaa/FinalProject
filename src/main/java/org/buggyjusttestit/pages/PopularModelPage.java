package org.buggyjusttestit.pages;

import org.buggyjusttestit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopularModelPage extends BasePage {
    public PopularModelPage(WebDriver driver) { super (driver); }

    @FindBy(xpath = "//img[@title='Diablo']")
    WebElement popularModel;

    public void clickPopularModelButton(){
        clickToElementWithWait(popularModel);
    }


}
