package restAPITests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class T09_Read_Json_ResponseBody {
	@Test

	public void EmployeeBody()
	{
	 RestAssured.baseURI = "https://reqres.in/";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response = httpRequest.get("/api/users/2");
	 
	 // Retrieve the body of the Response
	 ResponseBody body = response.getBody();
	 
	 // By using the ResponseBody.asString() method, we can convert the  body
	 // into the string representation.
	 System.out.println("Response Body is: " + body.asString());
}
}