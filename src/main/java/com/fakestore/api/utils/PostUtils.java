package com.fakestore.api.utils;

import com.fakestore.api.specifications.RequestSpec;
import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.response.Response;

public class PostUtils{
	
	public static Response post(String endpoint, File requestBody) {
		
		return given()
				.spec(RequestSpec.getRequestSpec())
				.body(requestBody)
				.when()
				.post(endpoint);
	}
	
	public static Response post(String endpoint, Object requestBody) {
		
		return given()
				.spec(RequestSpec.getRequestSpec())
				.body(requestBody)
				.when()
				.post(endpoint);
	}
}