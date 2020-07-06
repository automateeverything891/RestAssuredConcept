package restAPITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class T05_Validate_Status_Line {
		@Test
	 public void GetEmployeeDetails()
	 {
	 RestAssured.baseURI = "https://reqres.in/";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/api/users/2");
	 
	 // Get the status code from the Response. In case of 
	 // a successfull interaction with the web service, we
	 // should get a status code of 200.
	 String statusLine = response.getStatusLine();
	 
	 // Assert that correct status code is returned.
	 Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status line returned");
	 }
}
