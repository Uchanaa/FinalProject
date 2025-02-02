package org.buggyjusttestit.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiUtils {

    // Method to send GET request and validate the status code
    public static void verifyStatusCode(String endpoint, int expectedStatusCode) {
        RestAssured.baseURI = endpoint;

        Response response = RestAssured
                .given()
                .when()
                .get()
                .then()
                .statusCode(expectedStatusCode) // Validate status code
                .extract()
                .response();

        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asString());
    }
}
