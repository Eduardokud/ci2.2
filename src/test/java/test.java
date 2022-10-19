import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class test {


    @Test
    void test1() {
        given()
                .baseUri("https://postman-echo.com")
                .body("id : 1," +
                        "name: This one," +
                        "number: 0668," +
                        "balance: 992821429," +
                        "currency: RUB") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("id : 1," +
                         "name: This one," +
                        "number: 0668," +
                        "balance: 992821429," +
                        "currency: RUB"))
        ;


    }






}
