package com.abushl123.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;


public abstract class CydeoTrainingTestBase {
    @BeforeAll
    static void init() {
        RestAssured.baseURI = "https://api.training.cydeo.com";
    }
}

