package JSON;

public class Json1 {

	public static String payLoad() 
	{

		return "{\r\n" + 
				"   \"name\": \"Apple MacBook Pro 16\",\r\n" + 
				"   \"data\": {\r\n" + 
				"      \"year\": 2020,\r\n" + 
				"      \"price\": 2000,\r\n" + 
				"      \"CPU model\": \"Intel Core i9\",\r\n" + 
				"      \"Hard disk size\": \"1 TB\"\r\n" + 
				"   }\r\n" + 
				"}";

	}
	
	public static String payload2() 
	
	{
		return "{\r\n" + 
				"   \"name\": \"Apple MacBook Pro 16\",\r\n" + 
				"   \"data\": {\r\n" + 
				"      \"year\": 2019,\r\n" + 
				"      \"price\": 2049,\r\n" + 
				"      \"CPU model\": \"Intel Core i9\",\r\n" + 
				"      \"Hard disk size\": \"1 TB\",\r\n" + 
				"      \"color\": \"silver\"\r\n" + 
				"   }\r\n" + 
				"}";
	}
	public static String payload3() {
		
		return "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 910,\r\n" + 
				"    \"website\": \"rahulshettyacademy.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": [\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Selenium Python\",\r\n" + 
				"      \"price\": 50,\r\n" + 
				"      \"copies\": 6\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"Cypress\",\r\n" + 
				"      \"price\": 40,\r\n" + 
				"      \"copies\": 4\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"title\": \"RPA\",\r\n" + 
				"      \"price\": 45,\r\n" + 
				"      \"copies\": 10\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
	}

}
