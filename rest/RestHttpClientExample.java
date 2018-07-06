package edu.wbl;


import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;


public class RestHttpClientExample {

	public static void main(String args[]) throws Exception{
//		1. URI 
//	    Creating  HttpClient using HttpClientBuilder...CloseableHttpClient		
		HttpClient client=HttpClientBuilder.create().build();
		
//2. set the http method - get, put, post, delete
//	    Use HttpGet, HttpPut, HttpPost, HttpDelete
	    
		HttpGet get =new  HttpGet("https://api.qa.talentscreen.io/v1/subjects?authentication=false");

	//	3. we set the headers and request parameter
	 //   get/put/post/delete.addHeader("key","value")

		//get.addHeader("content-type","application/json");
		
//		4. send button click
//	    get/put/post/delete...execute		
		
		// HttpUriRequest
		HttpResponse response = client.execute(get);
		
/*		5. response

		   Response      = Status-Line
		                     *(( general-header
		                      | response-header
		                      | entity-header ) CRLF)
		                     CRLF
		                     [ message-body ]
		*/
		
		
		String statusLine = response.getStatusLine().toString();
		System.out.println("status line :" + statusLine);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("status code :" +statusCode);
		String responseString = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		System.out.println("------------------");
		System.out.println(responseString);
		System.out.println("------------------");
		Header[] headers = response.getAllHeaders();
		for(Header h:headers) {
			System.out.println(h.getName() + "===" + h.getValue());
					}
		
	/*
	 6. parse the response
   JSonParsing.... parsing/marshalling
   use org.json ...Jackson API....google json

   JSONArray
   JSONObject	
	 */

		JSONArray json = new JSONArray(responseString);
		System.out.println(json.toString());
		System.out.println("------------------");
		System.out.println("id:"+((JSONObject)json.get(0)).get("id"));
		System.out.println("------------------");
		JSONObject jsonObj = (JSONObject)json.getJSONObject(0);
		Set<String> key = jsonObj.keySet();
		System.out.println("Keys ----->"+key);
		System.out.println("------------------");
		for(String s: key) {
			System.out.println(s + ":::::::" + jsonObj.get(s));
		}
		System.out.println("------------------");
/*
 7. assert
using testng 
		check of valid uri
		check statuscode, status message
		
		get set header....check for response for valid resource
		get set header....check for response for invalid resource
		
		post set different header as in the doc and check for expected output
		post must parameter and optional parameter
		
		
 */
		Assert.assertEquals(statusCode, 200);
		Assert.assertTrue(statusLine.contains("HTTP/1.1 200 OK"));
		
		
	}
	
}
