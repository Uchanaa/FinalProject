package org.buggyjusttestit.tests;

import org.buggyjusttestit.api.ApiUtils;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void testGetDataEndpoint() {
        // API endpoint URL
        String endpoint = "https://reqres.in/api/users?page=2";

        // Call ApiUtils method to verify status code
        ApiUtils.verifyStatusCode(endpoint, 200);
    }
}
