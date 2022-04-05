package http;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch {
	
	@Test
	void TestPatch() {

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
		    patch("/api/users/2")
		.then()
		    .statusCode(200).log().all();
		
	}
}
