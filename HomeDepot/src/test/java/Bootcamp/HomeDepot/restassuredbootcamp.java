package Bootcamp.HomeDepot;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;

public class restassuredbootcamp {
  @Test
  public void f() {
	  Response it =  given().log().all().get("https://reqres.in/api/users?page=2");
		 it.prettyPrint();
		 System.out.println(it.getStatusCode());
		 RestAssured.baseURI = "https://reqres.in/";
		 given().log().all().queryParam("page","2").get("api/users").then().log().all().assertThat().statusCode(200);
  }
}
