package Selenium.AutoPractices;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

import io.restassured.specification.RequestSpecification;

public class apiPractice {

	public static RequestSpecification requestSpec;
	
	public static RequestSpecification RequestSpecBuild() {
		 return requestSpec = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();
		
	}
	public static void main(String[] args) {
		
		VerifyAPIResponse(200);
		
	}

	public static void VerifyAPIResponse(int value) {
		given().spec(RequestSpecBuild())
		.when().get("/api/users/2")
		.then().assertThat().statusCode(value);

	}
	
	
	
	
	
}
