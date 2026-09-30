package com.fakestore.api.specifications;

import com.fakestore.api.config.ConfigReader;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec{
	
	public static RequestSpecification getRequestSpec() {
		
		
		return new RequestSpecBuilder()
				.setBaseUri(ConfigReader.getBaseUrl())
				.setContentType(ContentType.JSON)
				.setAccept(ContentType.JSON)
				.build();
				
	}
}