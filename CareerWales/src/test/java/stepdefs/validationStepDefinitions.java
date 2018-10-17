package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;
import static org.junit.Assert.assertEquals;
import static services.Endpoints.BASE_URL;

public class validationStepDefinitions {
    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;

    @Given("I request detail from the service$")
    public void i_request_details_from_the_service(){
        request = given().param("0");
    }

    @When("^a user retrieves detail by id$")
    public void a_user_retrieves_details_by_id(){
        Response response =
                given()
                        .contentType(io.restassured.http.ContentType.JSON)
                        .get(BASE_URL);
        System.out.println(BASE_URL);
       // assertEquals(200, response.getStatusCode());
       // response = request.when().get(BASE_URL);
        //System.out.println("response: " + response.prettyPrint());
    }

    @Then("the status code is (\\d+)")
    public void verify_status_code(int statusCode){
        json = response.then().statusCode(statusCode);
        response.getStatusCode();
    }
}
