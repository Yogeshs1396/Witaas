package apiautomation;

import io.restassured.path.json.JsonPath;

public class Data2 {
	
	public static JsonPath doJson(String response)
	{
		JsonPath js1=new JsonPath(response);
		return js1;
	}

}
