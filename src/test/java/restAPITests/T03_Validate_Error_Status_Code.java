package restAPITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class T03_Validate_Error_Status_Code {
	@Test
	 public void GetEmployeeDetailsInvalidEndpoint()
	 {
	 RestAssured.baseURI = "https://reqres.in/";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/7878787878");
	 
	 // Get the status code from the Response. In case of 
	 // a successfull interaction with the web service, we
	 // should get a status code of 200.
	 int statusCode = response.getStatusCode();
	 
	 // Assert that correct status code is returned.
	 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
	 }
}
