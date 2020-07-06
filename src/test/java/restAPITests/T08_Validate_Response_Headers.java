package restAPITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class T08_Validate_Response_Headers {

@Test
public void GetEmployeeHeaders()
{
 RestAssured.baseURI = "https://reqres.in/";
 RequestSpecification httpRequest = RestAssured.given();
 Response response = httpRequest.get("/api/users/2");
 
 // Reader header of a give name. In this line we will get
 // Header named Content-Type
 String contentType = response.header("Content-Type");
 Assert.assertEquals(contentType /* actual value */, "application/json; charset=utf-8" /* expected value */);
 
 // Reader header of a give name. In this line we will get
 // Header named Server
 String serverType =  response.header("Server");
 Assert.assertEquals(serverType /* actual value */, "cloudflare" /* expected value */);
 
 // Reader header of a give name. In this line we will get
 // Header named Content-Encoding
 String contentEncoding = response.header("Content-Encoding");
 Assert.assertEquals(contentEncoding /* actual value */, "gzip" /* expected value */);
}
}
