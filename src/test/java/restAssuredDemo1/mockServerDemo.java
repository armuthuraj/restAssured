package restAssuredDemo1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class mockServerDemo {
	//@Test

	public void test1_get() {
		baseURI = "http://localhost:3000/";
		given().
			get("/users").
		then().
			statusCode(200).
			log().all();
		
	}
	//@Test

	public void test2_get() {
		//equivalent to http://localhost:3000/subjects?name=Automation
		baseURI = "http://localhost:3000/";
		given().
			param("name", "Automation").
			get("/subjects").
		then().
			statusCode(200).
			log().all();
		
	}
	
	//@Test

	public void test3_post() {
		
		JSONObject request = new JSONObject();
		request.put("firstName", "Muthu");
		request.put("lastName", "QA&E");
		request.put("subjectId", 1);
		baseURI = "http://localhost:3000/";
		given().
			header("Contetnt-Type", "application/json").
			body(request.toJSONString()).
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
	}
	//@Test
	
	public void test4_patch() {
		
		JSONObject request = new JSONObject();
		
		request.put("lastName", "QA&EPatch");
	
		baseURI = "http://localhost:3000/";
		given().
			header("Contetnt-Type", "application/json").
			body(request.toJSONString()).
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
		when().
			patch("/users/4").
		then().
			statusCode(200).
			
			log().all();
	}
	
	//@Test
	
public void test3_put() {
		
		JSONObject request = new JSONObject();
		request.put("firstName", "Muthuput");
		request.put("lastName", "QA&Eput");
		request.put("subjectId", 1);
		baseURI = "http://localhost:3000/";
		given().
			header("Contetnt-Type", "application/json").
			body(request.toJSONString()).
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
		when().
			put("/users/4").
		then().
			statusCode(200).
			log().all();
	}

@Test
public void test_delete() {
	baseURI = "http://localhost:3000/";
	when().
	delete("/users/4").
	then().
	statusCode(200).log().all();
	
}
}
