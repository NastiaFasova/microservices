package com.example.ui;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Ignore
public class LiveTest {
    @Test
    public void whenSendRequestToFooResource_thenOK() {
        final Response response = RestAssured.get("http://localhost:8080/foos/1");
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void whenSendRequest_thenHeaderAdded() {
        final Response response = RestAssured.get("http://localhost:8080/foos/1");
        assertEquals(200, response.getStatusCode());
        assertEquals("TestSample", response.getHeader("Test"));
    }
}
