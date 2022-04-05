package http;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get {
	
	
	@Test(priority=1)
	void test01() {

		System.out.println("==================Test01 begins....!!!!==================");
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("The status Code is:-"+response.getStatusCode());
		System.out.println(response.getBody());
		System.out.println(response.asString());
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Content-Type"));

		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		System.out.println("==================Test01 ends....!!!!==================");

	}

	@Test(priority=2)
	void test02() {

		System.out.println("==================Test02 begins....!!!!==================");
		baseURI = "https://reqres.in";	
		given().get("/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7));
		System.out.println("==================Test02 ends....!!!!==================");	
	}

	@Test(priority=3)
	void Get_Test() {
		System.out.println("==================Get Test begins....!!!!==================");

		baseURI = "https://reqres.in";	
		given()
		.get("/api/users?page=2").
		then()
		.statusCode(200)
		.body("data.id[0]", equalTo(7))
		.log().all();
		System.out.println("==================Get Test Ends....!!!!==================");
	}

}