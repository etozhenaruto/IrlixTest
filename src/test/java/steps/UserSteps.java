package steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojos.CocktailsPojo;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserSteps {

    private static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
                    .setBaseUri("http://109.195.203.123:48880/")
                    .setBasePath("/cocktails")
                    .setContentType(ContentType.JSON)
                    .build();

    public static List <CocktailsPojo> getCocktails(){
        return given().spec(REQ_SPEC)
                .get().jsonPath().getList("", CocktailsPojo.class);
    }
}
