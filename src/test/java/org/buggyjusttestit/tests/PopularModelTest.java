package org.buggyjusttestit.tests;

import org.buggyjusttestit.BaseTest;
import org.buggyjusttestit.pages.PopularModelPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.buggyjusttestit.data.PopularModelData.*;




public class PopularModelTest extends BaseTest {
    @Test
    public void testPopularModelURL(){
      PopularModelPage PopularModel = new PopularModelPage(driver);
        PopularModel.clickPopularModelButton();
        String expectedUrl = POPULAR_MODEL_PAGE_URL;
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,ERROR_URL_MESSAGE);

    }
}
