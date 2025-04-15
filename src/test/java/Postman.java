import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Postman {


    @Test
    public void get() {
        given()
                .baseUri("https://postman-echo.com")
                .params("foo1", "bar1")
                .params("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void post() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body")
                .when()
                .post("/post")
                .then()
                .body("data", equalTo("This is expected to be sent back as part of response body"));

    }

    @Test
    public void postData() {
        given()
                .baseUri("https://postman-echo.com")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .when()
                .post("/post")
                .then()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void put() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body")
                .when()
                .put("/put")
                .then()
                .body("data", equalTo("This is expected to be sent back as part of response body"));
    }

    @Test
    public void patch() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body")
                .when()
                .patch("/patch")
                .then()
                .body("data", equalTo("This is expected to be sent back as part of response body"));
    }

    @Test
    public void delete() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body")
                .when()
                .delete("/delete")
                .then()
                .body("data", equalTo("This is expected to be sent back as part of response body"));
    }
}
