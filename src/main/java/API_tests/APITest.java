package API_tests;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {
  ObjectMapper mapper = new ObjectMapper();
     @Test
    public void getProfileService() throws Exception {
        Response mr = RestAssured.get("http://localhost:3000/profile");
        System.out.println(mr.asString());
       // RestAssured.given().header(XXXXXX) --> instead of XXXXXX me can put name of map( in which we can save all key- values)
        System.out.println(mr.statusCode());

       // ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(mr.asString(), User.class);
        System.out.println("Location:"+ user.getLocation());
        System.out.println(user.getAge());

         Assert.assertEquals(200,mr.statusCode());
         Assert.assertEquals("James", user.getName());
    }
    @Test(priority=1)
    public void  postProfitService() throws Exception{
         User user = new User();
         user.setAge(35);
         user.setLocation("LA");
         user.setName("John");

         String myRequest = mapper.writeValueAsString(user);
         System.out.println(myRequest);  // this way we'll have it in JSon format

        Response mr = RestAssured.given().contentType(ContentType.JSON).body(myRequest).post("http://localhost:3000/profile");
        System.out.println("Status:"+ mr.statusCode());

        // to check if it was updated

        Response mr2 = RestAssured.get("http://localhost:3000/profile");
        User user2 = mapper.readValue(mr2.asString(),User.class);
        System.out.println("location"+user2.getLocation());



    }
}
