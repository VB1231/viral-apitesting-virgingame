package com.virgingames.testBase;

import com.virgingames.utils.TestUtils;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase extends TestUtils {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://www.virgingames.com/bingo";
        RestAssured.basePath = "/GetBingoLobbyFeed.do";
    }
}
