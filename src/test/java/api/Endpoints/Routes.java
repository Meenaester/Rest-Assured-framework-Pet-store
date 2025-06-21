package api.Endpoints;
//Swagger url = https://petstore.swagger.io/v2
//	Create user = https://petstore.swagger.io/v2/user
//    Get User = https://petstore.swagger.io/v2/user/{username}
//    	Update user = https://petstore.swagger.io/v2/user/{username}
//    		delete user = https://petstore.swagger.io/v2/user/{username}
    		
public class Routes {
public static String  Base_url = "https://petstore.swagger.io/v2";

// user module
public static String post_url = Base_url+"/user";
public static String get_url = Base_url+"/user/{username}";
public static String delete_url = Base_url+"/user/{username}";
public static String update_url = Base_url+"/user/{username}";
	
}
