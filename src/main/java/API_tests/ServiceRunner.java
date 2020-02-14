package API_tests;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;


public class ServiceRunner {
    // this class will handle all responses and requests, will include 2 methods for POST and GET
    private static MyResponse resp;
    private static ObjectMapper mapper = new ObjectMapper();
    public static void runGetRequest(String url){
        Response mr = RestAssured.get();
        try {
            resp = mapper.readValue(mr.asString(), MyResponse.class);
        }catch(Exception e) {
            System.out.println("JSon couldn't map into MyResponse object");
            e.printStackTrace();
        }
    }
    public static void  runPostRequest (String uri, MyRequest body){
        String json = "";
        try {
            json = mapper.writeValueAsString(body);
        }catch(JsonProcessingException e){
            System.out.println("Couldn't convert from POJO to Json");
            e.printStackTrace();
        }
        Response mr = RestAssured.given().contentType(ContentType.JSON).body(json).post(uri);
        try {
            resp = mapper.readValue(mr.asString(), MyResponse.class);
        }catch(Exception e) {
            System.out.println("JSon couldn't map into MyResponse object");
            e.printStackTrace();
        }
    }








    public static MyResponse getResponse(){
        return resp;

    }

}
