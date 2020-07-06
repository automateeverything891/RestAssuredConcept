package restAPITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class T10_Validate_Json_ResponseBody {
	@Test

	public void EmployeeBody()
	{
	 RestAssured.baseURI = "https://reqres.in/";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/api/users/2");
	 
	 // Retrieve the body of the Response
	 ResponseBody body = response.getBody();
	 
	// To check for sub string presence get the Response body as a String.
	 // Do a String.contains
	 String bodyAsString = body.asString();
	 Assert.assertEquals(bodyAsString.contains("Janet") /*Expected value*/, true /*Actual Value*/, "Response body contains Janet");
}
}