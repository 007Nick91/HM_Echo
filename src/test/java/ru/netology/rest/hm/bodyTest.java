package ru.netology.rest.hm;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class bodyTest {

    @Test
    void shouldReturn() {

        given()
                .baseUri("https://postman-echo.com")
                .body("gorgeous") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data",equalTo("великолепный"));
    }

}
