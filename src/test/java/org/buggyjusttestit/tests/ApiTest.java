package org.buggyjusttestit.tests;

import org.buggyjusttestit.api.ApiUtils;
import org.buggyjusttestit.data.ApiTestData;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void testGetDataEndpoint() {
        // API endpoint URL
        String endpoint = ApiTestData.API_URL;
        // Call ApiUtils method to verify status code
        ApiUtils.verifyStatusCode(endpoint, 200);
    }
}
