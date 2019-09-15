package RestPractice;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.ConfigurationReader;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Deseilization_Test {
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "http://54.90.192.251";
        RestAssured.port = 8000;
        RestAssured.basePath = "/api";
        // above will generate a BASE REQUEST URL OF http://52.23.254.102:8000/api
    }

    @Test
    public void DeserializeAnJsonToObject_Test() {
        Spartan sp1 = get("/spartans/10")
                .jsonPath()
                .getObject("", Spartan.class);
        System.out.println(sp1);

    }
}
