package restAPITests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class T14_POST_request {
	@Test
	public void RegistrationSuccessful()
	{ 
	 RestAssured.baseURI ="https://reqres.in";
	 RequestSpecification request = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("name", "Optimus"); 
	 requestParams.put("job", "TestManager");
	
	 request.header("Content-Type", "application/json; charset=utf-8");	
	 request.body(requestParams.toJSONString());
	 Response response = request.post("/api/users");
	 
	 int statusCode = response.getStatusCode();
	 Assert.assertEquals(statusCode, 201);
//	 String successCode = response.jsonPath().get("SuccessCode");
//	 Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}
}
