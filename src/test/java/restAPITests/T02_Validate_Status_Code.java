package restAPITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class T02_Validate_Status_Code {
		@Test
	 public void GetEmployeeDetails()
	 {
	 RestAssured.baseURI = "https://reqres.in/";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/api/users/2");
	 
	 // Get the status code from the Response. In case of 
	 // a successful interaction with the web service, we
	 // should get a status code of 200.
	 int statusCode = response.getStatusCode();
	 
	 // Assert that correct status code is returned.
	 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
	 }
}
