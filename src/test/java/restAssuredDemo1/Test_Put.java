package restAssuredDemo1;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Put {
	
	//patch will be same as like this program just replace put with patch
	
	@Test
	public void test_1_put() {

		JSONObject request = new JSONObject();
		request.put("name", "Muthu");
		request.put("job", "QA&E");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
			header("Contetnt-Type", "application/json").
			body(request.toJSONString()).
			accept(ContentType.JSON).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}

}



