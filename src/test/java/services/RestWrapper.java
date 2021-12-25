package services;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;
import pojos.UserLoginPojo;

import static io.restassured.RestAssured.given;

public class RestWrapper {
    private static final String BASE_URL = "http://109.195.203.123:48880/";
    private static RequestSpecification REQ_SPEC;
    private Cookies;

    private  RestWrapper(Cookies cookies){
        this.cookies = cookies;

        REQ_SPEC = new RequestSpecBuilder()
                .addCookie(cookies)
                .setBaseUri("http://109.195.203.123:48880")
                .setBasePath("/auth/login")
                .setContentType(ContentType.JSON)
                .build();

    }

    public static RestWrapper loginAs(String login, String password){
        Cookies cookies = given()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URL)
                .basePath("/auth/login")
                .body(new UserLoginPojo(login,password))
                .post()
                .getDetailedCookies();

        return new RestWrapper(cookies);

    }


}
