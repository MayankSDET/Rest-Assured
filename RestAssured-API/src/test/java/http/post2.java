package http;

import org.testng.annotations.Test;

import JSON.Json1;
import io.restassured.path.json.JsonPath;

public class post2 {

	
	public static void main(String[] args) {

		//print number of course in an API
		JsonPath js = new JsonPath(Json1.payload3());
		int size = js.getInt("courses.size()");
		System.out.println(size);
		
		//print purchase amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
	}

}
