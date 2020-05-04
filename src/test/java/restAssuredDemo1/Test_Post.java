package restAssuredDemo1;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_Post {
	
	@Test
	public void test_1_post() {
		//map is key, Value pair in java
		//Map<String,Object> map = new HashMap<String, Object>();
		//THis was we can use json without using json librARY
		/*map.put("\"name\"", "\"Muthu\"");
		map.put("\"job\"", "\"QA&E\"");
		System.out.println(map);*/
		
		//map.put("name", "Muthu");
		//map.put("job", "QA&E");
		
		//JSONObject request = new JSONObject(map);
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
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
		
	}

}
