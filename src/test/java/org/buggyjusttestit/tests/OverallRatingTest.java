package org.buggyjusttestit.tests;

import org.buggyjusttestit.BaseTest;
import org.buggyjusttestit.pages.OverallRatingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.buggyjusttestit.data.OverallRatingData.*;


public class OverallRatingTest extends BaseTest {

    @Test
    public void testOveralRatingUrl(){
        OverallRatingPage OverallRating = new OverallRatingPage(driver);
        OverallRating.clickOverallRatingButton();
        String expectedUrl = OVERALL_RATING_PAGE_URL;
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,ERROR_URL_MESSAGE);

    }



}
