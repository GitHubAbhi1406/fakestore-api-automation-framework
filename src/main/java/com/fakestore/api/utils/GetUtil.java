package com.fakestore.api.utils;

import com.fakestore.api.specifications.RequestSpec;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GetUtil{
	
	public static Response get(String endpoint) {
		
		return given()
				.spec(RequestSpec.getRequestSpec())
				.when()
				.get(endpoint);
	}
}