package stepdefs;

import com.google.gson.JsonObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;

import static services.Endpoints.BASE_URL;

public class validationStepDefinitions {
    private Response response;
    private int json;
    private RequestSpecification request;

    @Given("I request detail from the service$")
    public void i_request_details_from_the_service() {
        //request = given().param("1");
    }

    @When("^a user retrieves detail by id$")
    public void a_user_retrieves_details_by_id() {
        given().when().get(BASE_URL + "v1/programmes/").then()
                .body("id", hasItems(1, 2, 11, 12, 13, 14, 15, 16, 17, 18));
//        given().when().get(BASE_URL + "v1/programmes/").then()
//                .body("id",equalTo(("[1, 2, 11, 12, 13, 14, 15, 16, 17, 18]")))
//               // .body("name.en", equalTo(("nameEn1"));
//               // .id("id", containsString(("")));
//                .body("duration", equalTo("[{cy=Ysbeidiau Heulog..., en=Hello Sunshine...}, {cy=Ysbeidiau Heulog..., en=Hello Sunshine...}, {cy=Mae cymorth ar gael dros gyfnod llawn y rhaglen., en=Support is available for the duration of the programme.}, {en=It depends on the type of support}, {cy=Mae cymorth ar gael dros gyfnod llawn y rhaglen neu nes bydd diweithdra yn dechrau., en=Support is available for the duration of the programme or until employment starts.}, {cy=6 Mis (ac eithrio unrhyw mewn gwaith hyfforddi) a wneir i fyny o 120-140 oriau lleoliadau gwaith a 2-8 wythnos cyflogwr hyfforddiant penodol., en=6 Months (excluding any in-work coaching) made up from 120-140 hours work placements and 2-8 weeks employer specific training }, {cy=Mae cymorth ar gael dros gyfnod llawn y rhaglen., en=Support is available for the duration of the programme.}, {cy=Mae cymorth ar gael dros gyfnod llawn y rhaglen., en=Support is available for the duration of the programme.}, {cy=Cam 1 - amrywiol, Mae Cam 2 yn gwrs wythnos o hyd. , en=Phase 1 - variable, Phase 2 is a week long course. }, {cy=Mae cymorth ar gael dros gyfnod llawn y rhaglen., en=Support is available for the duration of the programme.}]"));

    }

    @Then("the status code is (\\d+)")
    public void verify_status_code(int statusCode) {
        given().when().get(BASE_URL + "v1/programmes/").then()
                .statusCode(200)
                .body(containsString("location"));


    }

    @Given("^I am a new user$")
    public void i_am_a_new_user() {
        //request = given().param("1");

    }

    @When("I register my details$")
    public void i_register_my_details() {



        String payload = "{\n" +
                "\"id\": 0,\n" +
                "\"additionalInformation\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"cost\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"description\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"duration\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"eligibilityCriteriaSummary\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"howWouldIBenefit\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"location\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"name\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"providedBy\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\"supportAvailable\": {\n" +
                "\"cy\": \"Ysbeidiau Heulog...\",\n" +
                "\"en\": \"Hello Sunshine...\"\n" +
                "},\n" +
                "\n" +
                "\"expiryDate\": \"2019-09-21\",\n" +
                "\"publicationDate\": \"2018-09-21\",\n" +
                "\"fundedByESF\": true,\n" +
                "\"eligibility\": {\n" +
                "\"ageRange\": {},\n" +
                "\"communitiesFirst\": true,\n" +
                "\"educationStatuses\": [],\n" +
                "\"employmentSectors\": [],\n" +
                "\"employmentStatuses\": [],\n" +
                "\"ethnicities\": [],\n" +
                "\"interestInStartingOwnBusiness\": true,\n" +
                "\"localAuthorityAreaCodes\": [],\n" +
                "\"qualifications\": [],\n" +
                "\"redundantWithin3Months\": true,\n" +
                "\"specialCircumstances\": [],\n" +
                "\"specificGender\": \"MALE\"\n";

        /*
        Response response = given()
                .relaxedHTTPSValidation()
                .body(payload)
                .with()
                .contentType("application/json")
                .post("http://programme-service.cw-dev-aks-ns.52.151.95.24.nip.io/v1/programmes/");
        int statusCode = response.getStatusCode();
        System.out.println("Post" + statusCode + "here");
        */
        ////////////////////////////////////////////////////


        given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post("BASE_URL + v1/programmes/")
                .then()
                .statusCode(201);
    }


        @Then("I should get confirmation")
        public void i_should_get_confirmation () {
            //assertEquals(location,response.getBody());
            //ResponseBody body = response.getBody();

            // Get Response Body as String
            //String bodyStringValue = body.asString();
            // Validate if Response Body Contains a specific String
            //Assert.assertTrue(bodyStringValue.contains("id"));


        }


    }


