import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
import pojos.*;
import services.RestWrapper;
import steps.UserSteps;
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class RestTests {

    private static RestWrapper api;

    @BeforeAll
    public static void prepareClient(){
        api = RestWrapper.loginAs("admin1290@admin.com", "111");
    }


    @Test
    public void getCocktails() {
        List<CocktailsPojo> cocktails = UserSteps.getCocktails();
        assertThat(cocktails).extracting(CocktailsPojo::getComment).contains("good");
    }




}
