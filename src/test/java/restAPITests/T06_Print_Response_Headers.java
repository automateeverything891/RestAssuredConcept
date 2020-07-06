package restAPITests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class T06_Print_Response_Headers {
@Test
public void GetEmployeeHeaders()
{
 RestAssured.baseURI = "https://reqres.in/";
 RequestSpecification httpRequest = RestAssured.given();
 Response response = httpRequest.get("/api/users/2");
 
 // Reader header of a give name. In this line we will get
 // Header named Content-Type
 String contentType = response.header("Content-Type");
 System.out.println("Content-Type value: " + contentType);
 
 // Reader header of a give name. In this line we will get
 // Header named Server
 String serverType =  response.header("Server");
 System.out.println("Server value: " + serverType);
 
 // Reader header of a give name. In this line we will get
 // Header named Content-Encoding
 String acceptLanguage = response.header("Content-Encoding");
 System.out.println("Content-Encoding: " + acceptLanguage);
}
}
