import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class GetApi {
	
	public static void main (String[] args){
	//Get List of users
	
	
	//RestAssured works on the following principle:
	//given
	
	//when
	
	//then
	
	
	RestAssured.baseURI = "https://reqres.in/";
	given().log().all().queryParam("page", "2").header("Content-type", "Application/json").
	when().get("api/users").
	then().log().all().assertThat().statusCode(200);

}
}