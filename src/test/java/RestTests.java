
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojos.*;

import java.util.List;

import static io.restassured.RestAssured.given;


public class RestTests {

    private final String MAIN_URL = "http://109.195.203.123:48880/";
    private final String COCKTAILS = "/cocktails";
    private final String INGREDIENTS = "/ingredients";
    private final String LOGIN = "admin1290@admin.com";
    private final String PASSWORD = "111";

    @Test
    public void getUsers(){
       List <DrinksPojo> cocktails = given()
                 .baseUri(MAIN_URL)
                 .basePath(COCKTAILS)
                 .contentType(ContentType.JSON)
                 .when().get()
                 .then()
                 .statusCode(200)
                 .extract().jsonPath().getList("", DrinksPojo.class);
        System.out.println(cocktails);
    }
}
