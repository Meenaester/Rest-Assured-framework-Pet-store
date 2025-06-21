package api.Endpoints;

import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndpoints {

	public static Response Createuser(User payload)
	
	{
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post(Routes.post_url);
				return response;
	}
public static Response GetUser(String userName)
	
	{
		Response response = given()
				.pathParam("username", userName)
				.when()
				.get(Routes.get_url);
				return response;
	}
public static Response Updateuser(User payload, String userName)

{
	Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
			.pathParam("username",userName)
			.when()
			.put(Routes.update_url);
			return response;
}
public static Response DeleteUser(String userName)

{
	Response response = given()
			.pathParam("username", userName)
			.when()
			.delete(Routes.delete_url);
			return response;
}
}
