import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojos.*;
import steps.UserSteps;
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class RestTests {

    @Test
    public void getCocktails() {
        List<CocktailsPojo> cocktails = UserSteps.getCocktails();
        assertThat(cocktails).extracting(CocktailsPojo::getComment).contains("good");
    }


    public void dealAuth(){
        AuthPojoRequest au = AuthPojoRequest.builder()
                        .email("admin1290@admin.com")
                        .password("111")
                        .build();

        given()
                .baseUri("http://109.195.203.123:48880/")
                .basePath("/cocktails")
                .contentType(ContentType.JSON)
                .body(au)
                .when().post()
                .then().extract().as(AuthResponse.class);

    }

}
