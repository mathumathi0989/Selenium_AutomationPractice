package Selenium.AutoPractices;

import static io.restassured.RestAssured.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class apiPractice {

	public static RequestSpecification requestSpec;
	
	public static RequestSpecification RequestSpecBuild() {
		 return requestSpec = new RequestSpecBuilder().setBaseUri("https://reqres.in/").build();
		
	}
	
	public static void main(String[] args) {
		VerifyAPIResponse_200(200);
		VerifyAPIResponse_400(404);
		VerifyContentType();
		VerifyResponseBody();
	}

	
	public static void VerifyAPIResponse_200(int value) {
		given().spec(RequestSpecBuild())
		.when().get("api/users/2")
		.then().assertThat().statusCode(value);
	}
	
	
	public static void VerifyAPIResponse_400(int value) {
		given().spec(RequestSpecBuild())
		.when().get("api/users/23")
		.then().assertThat().statusCode(value);
	}
	
	public static void VerifyContentType() {
		given().spec(RequestSpecBuild())
		.when().get("api/users/2")
		.then().assertThat().contentType("application/json");
	}
	
	
	public static String VerifyResponseBody() {
		String response = given().spec(RequestSpecBuild())
		.body("{\r\n"
				+ "    \"name\": \"mathuma\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when().post("api/users")
		.then().log().all().extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String id = js.get("id");
		System.out.println("ID is "+id);
		return id;
		
	}
	
	
}
