package restAPITests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class T16_PUT_Request {
@Test
	public void UpdateRecords(){
	 RestAssured.baseURI ="https://reqres.in";
	 RequestSpecification request = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("name", "zinger"); 
	 requestParams.put("job", "BA");
	 
	 request.header("Content-Type", "application/json; charset=utf-8");	
	 request.body(requestParams.toJSONString());
	 Response response = request.put("/api/users/2");
	 
	 int statusCode = response.getStatusCode();
	 System.out.println(response.asString());
	 Assert.assertEquals(statusCode, 200); 
	 
	 }
}
