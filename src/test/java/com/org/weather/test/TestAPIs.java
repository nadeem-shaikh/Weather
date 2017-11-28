package com.org.weather.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import io.restassured.http.ContentType;


public class TestAPIs extends FunctionalTest {

/*
 * Author : Nadeem Shaikh
 * Description: This test case check if the API for list of cities is working good.
 * 
 * */
@Test
public void test_Cities_API_Works() {

	given().when().get("/cities").then().statusCode(200);

}

/*
 * Author : Nadeem Shaikh
 * Description: This test case checks if the Weather API is working good.
 * 
 * */
@Test
public void test_Weather_API_Works() {

	given().when().get("/findWeather?city=Melbourne").then().statusCode(200);

}
}