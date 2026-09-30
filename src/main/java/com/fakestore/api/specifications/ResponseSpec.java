package com.fakestore.api.specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpec{
	
	public static ResponseSpecification getResponseSpec() {
		
		return new ResponseSpecBuilder()
				.expectContentType(ContentType.JSON)
				.build();
	}
}	