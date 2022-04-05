package http;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.testng.annotations.Test;

public class Delete {

	@Test
	void TestDelete() {
		

			when().
			    delete("https://reqres.in/api/users/2")
			.then()
			    .statusCode(204).log().all();
			
		}
	}
