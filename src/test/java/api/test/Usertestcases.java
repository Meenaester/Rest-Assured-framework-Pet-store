package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.Endpoints.UserEndpoints;
import api.payload.User;
import io.restassured.response.Response;

public class Usertestcases {

	Faker faker;
	User userpayload;
	@BeforeClass
	
	public void setupData()
	{
		faker=new Faker();
		userpayload=new User();
		userpayload.setId(faker.idNumber().hashCode());
		userpayload.setUsername(faker.name().username());
		userpayload.setFirstName(faker.name().firstName());
		userpayload.setLastName(faker.name().lastName());
		userpayload.setEmail(faker.internet().safeEmailAddress());
		userpayload.setPassword(faker.internet().password(5,10));
		userpayload.setPhone(faker.phoneNumber().cellPhone());
		
		
	}
	
	@Test(priority=1)
	public void postuser()

{
	Response response = UserEndpoints.Createuser(userpayload);
	response.then().log().all();
	Assert.assertEquals(response.getStatusCode(), 200);

}
	@Test(priority=2)
	public void Getuser()

{
	Response response = UserEndpoints.GetUser(this.userpayload.getUsername());
	response.then().log().all();
	Assert.assertEquals(response.getStatusCode(), 200);

}
}