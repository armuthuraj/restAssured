package restAssuredDemo1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExamples extends DataForTests{
	
	

	//@Test (dataProvider = "DataForPost" )
	public void test3_post(String fisrtName, String lastName, int subjectId) {
		
		JSONObject request = new JSONObject();
		request.put("firstName", fisrtName);
		request.put("lastName", lastName);
		request.put("subjectId", subjectId);
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
	
	
	//@Test(dataProvider = "dataForDelete")
	public void test_delete(int userId) {
		baseURI = "http://localhost:3000/";
		when().
		delete("/users/"+userId).
		then().
		statusCode(200).log().all();
		
	}

	@Parameters({"userID"})
	@Test
	 //for parameter data is coming from the testNG.xml
	public void test1_delete(int userId) {
	baseURI = "http://localhost:3000/";
	when().
	delete("/users/"+userId).
	then().
	statusCode(200).log().all();
	
}
}
