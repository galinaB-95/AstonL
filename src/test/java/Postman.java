import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Postman {
    @Test
    public void get(){
     given()
               .baseUri("https://postman-echo.com")
                .params("foo1", "bar1")
                .params("foo2","bar2")
               .when()
               .get("/get")
             .then()
             .body("args.foo1",equalTo("bar1"))
             .body("args.foo2",equalTo("bar2"));
    }
    @Test
    public void post(){
        HashMap<String,String> body = new HashMap<>();
        body.put("data","This is expected to be sent back as part of response body");
        given()
                .baseUri("https://postman-echo.com")
                .when()
                .body(body)
                .post("/post")
                .then()
                .body("post",equalTo("https://postman-echo.com/post"));
    }
}
