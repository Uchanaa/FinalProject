package org.buggyjusttestit.tests;

import org.buggyjusttestit.BaseTest;
import org.buggyjusttestit.pages.OverallRatingPage;
import org.buggyjusttestit.pages.PopularMakePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.buggyjusttestit.data.PopularMakeData.*;



public class PopularMakeTest extends BaseTest {

    @Test
    public void testPopularMakeURL(){
        PopularMakePage PopularMake = new PopularMakePage(driver);
        PopularMake.clickPopularMakeButton();
        String expectedUrl = POPULAR_MAKE_PAGE_URL;
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,ERROR_URL_MESSAGE);

    }

    @Test
    public  void lamboLogoTest(){
        PopularMakePage PopularMake = new PopularMakePage(driver);
        PopularMake.checkLamboLogo();

    }

}
