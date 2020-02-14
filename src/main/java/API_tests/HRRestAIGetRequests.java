package API_tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class HRRestAIGetRequests {
    /*
     * When I send a GET request to REST url http://34.223.219.142/ords/hr/employees
     * Then response status should be 200
     */


    @Test
    public void simpleGet() {
        when().get("http://34.223.219.142/ords/hr/employees")
                .then()
                .statusCode(200);
    }

    /*
     * When I send a GET request to REST url http://34.223.219.142/ords/hr/countries
     * Then response status should be 200
     * Then I should see JSON Response
     */
    @Test
    public void printResponse() {
        when().get("http://34.223.219.142/ords/hr/countries")
                .body().prettyPrint();
    }
    /*
     *When I send a GET request to REST url http://34.223.219.142/ords/hr/countries/US
     * And Accept type is "application/json"
     * Then response status code should be 200
     */

    @Test
    public void getWIthHaders() {
        with().accept(ContentType.JSON) // accept - application/json
                .when().get("http://34.223.219.142/ords/hr/countries/US")
                .then().statusCode(200);
    }

    /*
     *When I send a GET request to REST url:http://34.223.219.142/ords/hr/employees/12345
     * Then status code is 404
     */
    @Test
    public void negativeGet() {
        // 1 option
        // when().get("http://34.223.219.142/ords/hr/employees/12345")
        // .then().statusCode(404);

        // 2 option
        Response response = when().get("http://34.223.219.142/ords/hr/employees/12345");
        assertEquals(response.statusCode(),404);
        response.prettyPrint();
    }
    /*
    **When I send a GET request to REST url http://34.223.219.142/ords/hr/countries/US
     * And Accept type is "application/json"
     * Then response status code should be 200
     * And Response content should be json
     *
     * WITH,WHEN,GET,ASSERTTHAT,ACCEPT,CONTENTTYPE
     */
    @Test
    public void VerifyContentTypeWithAssertThat() {
        String url = "http://34.223.219.142/ords/hr/countries/US";

        given().accept(ContentType.JSON)
                .when().get(url)
                .then().assertThat().statusCode(200)
                .and().contentType(ContentType.JSON);
    }
    /*
    *given Accept type is "application/json"
    * When I send a GET request to REST url http://34.223.219.142/ords/hr/employees/100
     * Then response status code should be 200
     * And Response content should be json
     * And first name should be "Steven"
     */
    @Test
    public void verifyFirstName()throws URISyntaxException{
        URI uri = new URI("http://34.223.219.142/ords/hr/employees/100");

        given().accept(ContentType.JSON)
                .when().get(uri)
                .then().assertThat().statusCode(200)
                .and().contentType(ContentType.JSON)
                .and().assertThat().body("first_name", Matchers.equalTo("Steven"))
                .and().assertThat().body("employee_id", Matchers.equalTo(100));


    }
}

