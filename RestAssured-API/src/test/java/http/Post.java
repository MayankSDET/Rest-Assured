package http;

import org.testng.Assert;
import org.testng.annotations.Test;
import JSON.Json1;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

public class Post {

	//https://api.restful-api.dev/objects
	//https://api.restful-api.dev/objects/7

	@Test
	void test01() {
		//.body("price", equalTo("1849.99"))
		RestAssured.baseURI = "https://api.restful-api.dev/objects";
		String response = given().header("Content-Type", "application/json").body(Json1.payLoad()).when().post()
				.then().assertThat()
				.statusCode(200).body("data.\"CPU model\"", equalTo("Intel Core i9"))
				.header("Server", "cloudflare").log().all().extract().response().asString();

		System.out.println(response);
		//System.out.println(response.getTime());

		JsonPath js = new JsonPath(response);
		String id = js.getString("id");
		System.out.println(id);

		String actualprice = js.getString("data.price");
		System.out.println("The actual price is : "+actualprice);


		String response2 = given().header("Content-Type", "application/json").body(Json1.payload2())
				.when().put(id).then().assertThat().statusCode(200).log().
				all().extract().response().asString();

		JsonPath js1 = new JsonPath(response2);
		Float price = js1.getFloat("data.price");
		System.out.println("The updated price is : "+price);

		String response3 = given().header("Content-Type", "application/json").queryParam("id", id).when().get()
				.then().assertThat().statusCode(200).extract().response().asString();

		JsonPath js2 = new JsonPath(response3);
		Float price2 = js2.getFloat("data.price");
		System.out.println("The updated price is : "+price2);
		Assert.assertEquals(price2, price);

	}
}