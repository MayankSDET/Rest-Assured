package http;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.json.simple.JSONObject;

public class Put {
	
	@Test
	void TestPUT() {

		JSONObject request = new JSONObject();
		
		request.put("name", "Mayank Mani");
		request.put("Designation", "QA");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/";
		
		given()
		    .header("Content-Type", "application/json")
		    .contentType(ContentType.JSON)
		    .accept(ContentType.JSON)
		    .body(request.toJSONString())
		.when().
		    put("/api/users/2")
		.then()
		    .statusCode(200).log().all();
		
	}
}
