package restAssuredDemo1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.collection.HasItemInArray;
import org.testng.annotations.Test;

public class Test_GET {

	@Test
	public void Test_1() {
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			body("data.id[0]", equalTo(7)).
			log().all();		
	}
	
	@Test
	public void Test_2() {
		given().
			//header("Contetnt-Type", "application/json").
			//param(parameterName, parameterValues).
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			body("data.first_name", hasItems("Michael", "Lindsay"));	
					
	}
	
	//

}
