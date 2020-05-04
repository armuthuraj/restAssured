package restAssuredDemo1;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Delete {
	
	//patch will be same as like this program just replace put with patch
	
	@Test
	public void test_1_put() {

	
			
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
		
	}

}



