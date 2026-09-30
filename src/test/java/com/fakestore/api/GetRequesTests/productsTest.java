package com.fakestore.api.GetRequesTests;

import org.testng.annotations.Test;

import com.fakestore.api.specifications.ResponseSpec;
import com.fakestore.api.utils.GetUtil;

import io.restassured.response.Response;

public class productsTest{
	
	Response res;
	
	@Test
	public void getProductTest() {
		
		res = GetUtil.get("/products");
		
		res.then()
			.spec(ResponseSpec.getResponseSpec());
		
		
	}
}