package com.rest.RestAssured;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wbl.api_automation.helper.ConfigUtils;
import org.hamcrest.Matchers;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TSRestAssured {
	 int id;
	 String endpoint;
	 String reqPayload = "{ \"categoryid\": 1,\"name\": \"Java Core only\",  \"mode\": \"text/x-csharp\", \"icon_class\": \"ts-csharp\"	 }";

	 
	@BeforeSuite
	public void beforeSuite()
	{

		Properties prop=ConfigUtils.loadproperties("config.properties");
		endpoint=prop.getProperty(("TSurl"));
		
	}
	
	@Test(enabled=true, priority=1)
	public void get() {
		//RestAssured.given().when().get(endpoint+"\\subjects?authentication=false").then().statusCode(200);
		//given().when().get(endpoint+"\\subjects?authentication=false").then().statusCode(200);		
	//https://api.qa.talentscreen.io/v1/subjects      endpoint+"\\subjects?authentication=false"
		Response response = given().when().get("https://api.qa.talentscreen.io/v1/subjects").then().statusCode(200).extract().response();
		System.out.println(response.asString());
		
		//given().when().get(endpoint+"\\subjects?authentication=false")
		//   .then().statusCode(200).body("[0].id", equalTo(2)).body("[0].name", equalTo("C#");
		
	}
	
	@Test(enabled=true, priority = 2)
	public void post() {
		//given().contentType(ContentType.JSON).body(reqPayload).when().post(endpoint+"?authentication=false").then().statusCode(201);
	   Response resp = given().contentType(ContentType.JSON).body(reqPayload).when()
			   .post("https://api.qa.talentscreen.io/v1/subjects?authentication=false")
			   .then().statusCode(201)
			   .extract()
			   .response();
	   
	   System.out.println("code mirror theme===>"+ resp.path("codemirror_theme"));
	   
	   id = resp.path("id");
	   System.out.println("id===>"+ id);
	
	}
	
	
	@Test(enabled=true,dependsOnMethods="post", priority=3)
	public void put() {
		//given().contentType(ContentType.JSON).body(reqPayload).when().put(endpoint+"?authentication=false").then().statusCode(201);
	   Response resp = given().contentType(ContentType.JSON).body(reqPayload).when()
			   .put("https://api.qa.talentscreen.io/v1/subjects/"+id+"?authentication=false")
			   .then().statusCode(200)
			   .extract()
			   .response();
	   
	   System.out.println("code mirror theme===>"+ resp.path("codemirror_theme"));
	   
	   id = resp.path("id");
	   System.out.println("id===>"+ id);
	
	}
	
	@Test(enabled=true,dependsOnMethods="post", priority=4)
	public void delete() {
		//given().contentType(ContentType.JSON).body(reqPayload).when().put(endpoint+"?authentication=false").then().statusCode(201);
	    given().contentType(ContentType.JSON).body(reqPayload).when()
			   .delete("https://api.qa.talentscreen.io/v1/subjects/"+id+"?authentication=false")
			   .then().statusCode(204);
			   	
	}
	
	

}
