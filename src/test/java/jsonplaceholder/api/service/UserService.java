package jsonplaceholder.api.service;

import com.google.gson.Gson;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import jsonplaceholder.api.TestConfiguration;
import model.User;

import static io.restassured.RestAssured.given;

public class UserService {
    private String endpoint = TestConfiguration.baseEndpoint + TestConfiguration.baseUserPath;

    public User getUserById(int id) {
        given().queryParam("id", id).when().get(endpoint).then().log().body();
        Response response = given().queryParam("id", id).when().get(endpoint);
        String responseAsSting = response.asString();

        User[] users = new Gson().fromJson(responseAsSting, User[].class);
        return users[0];
    }

    public int getUsersNumber() {
        Response response = given().when().get(endpoint);
        JsonPath js = new JsonPath(response.asString());
        return js.getInt("data.size()");
    }
}
