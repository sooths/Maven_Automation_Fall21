package LastDay;

import Reusable_Library.ReusableActions;
import Reusable_Library.Reusable_Annotations;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GoogleSearchLoop extends Reusable_Annotations {

    //set the baseurl/endpoint in beforeClass to call it only once
    @BeforeSuite
    public void setup() {
        RestAssured.baseURI = "https://www.googleapis.com/customsearch/";
        RestAssured.basePath = "/v1";
    }//end of set up

    @Test
    public void googleSearch() throws InterruptedException {
        //store the api key in a variable
        String apiKey = "AIzaSyDwiWKBKB0zHjsb3-IsXs-301sJ3CkyjdU";
        ArrayList cities = new ArrayList();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");

        for (int i = 0; i < cities.size(); i++) {
            Response myResponse =
                    given()
                            .queryParam("key", apiKey)
                            .queryParam("cx", "09c4fb57ae0c4aafd")
                            .queryParam("q", cities.get(i))
                            .when()
                            //get post put or delete method as part of when
                            .get()
                            .then()
                            .extract()
                            .response();

            //verify if the status code is 200
            if (myResponse.statusCode() == 200) {
                System.out.println("Status code is 200 and successful");
                //this will return all the links within the item object in json
                List<String> linkCount = myResponse.path("items.link");
                //get all the tile within item object
                List<String> titleCount = myResponse.path("items.title");
                //verify the first 3 link you get from the link list and its title
                for (int j = 0; j < 1; j++) {
                    driver.navigate().to(linkCount.get(j));
                    Thread.sleep(2000);
                    String actualTitle = driver.getTitle();
                    if (actualTitle.equals(titleCount.get(j))) {
                        System.out.println("Title matches " + actualTitle);
                    } else {
                        System.out.println("Title doesn't match. Expected " + linkCount.get(0) + " and Actual " + actualTitle);
                    }
                }//end of of sub loop
            } else {
                System.out.println("Failed status code " + myResponse.statusCode());
            }
        }
    }
}