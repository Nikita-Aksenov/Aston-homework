package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

class GetTest {
    @Test
    @DisplayName("запрос Get")
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";
        Response response = given()
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .extract().response();

        DataBase.Root root = response.as(DataBase.Root.class);

        assertEquals("[:]", response.jsonPath().getString("args"));
        assertEquals("postman-echo.com", root.Headers().Host());
        String xRequestStart = root.Headers().X_request_start();
        assertNotNull(xRequestStart, "Поле x-request-start отсутствует в ответе");
        assertFalse(xRequestStart.isEmpty(), "Поле x-request-start пустое");
        assertEquals("https", root.Headers().X_forwarded_proto());
        assertEquals("443", root.Headers().X_forwarded_port());
        String traceId = root.Headers().X_amzn_trace_id();
        assertNotNull(traceId, "Поле x-amzn-trace-id отсутствует в ответе");
        assertFalse(traceId.isEmpty(), "Поле x-amzn-trace-id пустое");
        String userAgent = root.Headers().User_agent();
        assertNotNull(userAgent, "Поле user-agent отсутствует в ответе");
        assertTrue(userAgent.startsWith("PostmanRuntime"), "Поле user-agent не начинается с 'PostmanRuntime'");
        assertEquals("*/*", root.Headers().Accept());
        String postmanToken = root.Headers().Postman_token();
        assertNotNull(postmanToken, "Поле postman-token отсутствует в ответе");
        assertFalse(postmanToken.isEmpty(), "Поле postman-token пустое");
        assertEquals("gzip, deflate, br", root.Headers().Accept_encoding());
        String cookie = root.Headers().Cookie();
        assertNotNull(cookie, "Поле cookie отсутствует в ответе");
        assertFalse(cookie.isEmpty(), "Поле cookie пустое");
        assertEquals("https://postman-echo.com/get", root.Url());
    }
}