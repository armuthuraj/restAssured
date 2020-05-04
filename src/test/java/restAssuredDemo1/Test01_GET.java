package restAssuredDemo1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test01_GET {
	@Test
	void test_01() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("Status code of the request : "+response.getStatusCode());
		System.out.println("Body of the response : "+response.getBody().asString());
		System.out.println("Response of the request: "+response.asString());
		System.out.println("StatusLine of the response: "+response.getStatusLine());
		System.out.println("ContentType of the response: "+response.getHeader("content-type"));
		System.out.println("TIme of the response: "+response.getTime());
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test	
	void test_02() {
		//given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7));
		
	}
}
 