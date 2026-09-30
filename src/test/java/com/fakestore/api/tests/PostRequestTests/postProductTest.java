package com.fakestore.api.tests.PostRequestTests;

import org.testng.annotations.Test;

import com.fakestore.api.models.Product;
import com.fakestore.api.specifications.ResponseSpec;
import com.fakestore.api.utils.PostUtils;
import io.restassured.response.Response;

public class postProductTest{
	
	Response res;
	
	@Test
	public void testMethod() {
		
		Product obj = new Product(
				"Test Product",
		        29.99,
		        "Test description",
		        "test-category",
		        "http://example.com"
				
				);
		
		res = PostUtils.post("/products", obj);
		
		res.then()
			.spec(ResponseSpec.getResponseSpec())
			.statusCode(201);
	}
}