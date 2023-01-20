package com.virgingames.testSuit;

import com.virgingames.testBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class virginGame extends TestBase {
    static ValidatableResponse response;
    @Test
    public void test001() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        response = given().log().all()
                .when()
                .header("accept", "application/json")
                .get("")
                .then().statusCode(200);
        RestAssured.registerParser("text/plain", Parser.JSON);
        response.body("bingoLobbyInfoResource.streams[0].streamId", equalTo(194));
    }
    @Test
    public void test002(){
        RestAssured.registerParser("text/plain", Parser.JSON);
        response = given().log().all()
                .when()
                .header("accept", "application/json")
                .get("")
                .then().statusCode(200);
        RestAssured.registerParser("text/plain", Parser.JSON);
        response.body("bingoLobbyInfoResource.ventureId",equalTo(14));
    }
}
