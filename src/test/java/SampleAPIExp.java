import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class SampleAPIExp {


    @Test(description = "example for static import", enabled = true)
    public void staticImportExample(){

        RestAssured.given().
                baseUri("https://api.postman.com").
                header("X-Api-Key","PMAK-6597a145fd32020038584c7b-2a08687a94858176df74573cf4f1ed2d84").
                log().all().
                when().
                get("/workspaces").
                then().
                log().all();
    }

}
