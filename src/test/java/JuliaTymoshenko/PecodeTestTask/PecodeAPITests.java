package JuliaTymoshenko.PecodeTestTask;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PecodeAPITests extends Object {

    @Test
    public void checkPostRequestRegisterLogin() {
                given()
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .when()
                .post("https://www.pecodesoftware.com/qa-portal/registerlogin/registerlogin.php")
                .then()
                .statusCode(200);
    }

    @Test
    public void checkRequestIconLogo() {
                given()
                .header("sec-ch-ua", "'Not A;Brand';v='99', 'Chromium';v='102', 'Google Chrome';v='102'")
                .header("content-type", "image/svg+xml")
                .when()
                .get("https://pecode-software.web.app/static/media/icon-logo.f8576d05.svg")
                .then()
                .statusCode(200);
    }

    @Test
    public void checkRequestBackPicture() {
                given()
                .header("Accept-Ranges", "bytes")
                .header("Content-Type", "image/png")
                .when()
                .get("https://www.pecodesoftware.com/qa-portal/img/back.png")
                .then()
                .statusCode(200);
    }
}
