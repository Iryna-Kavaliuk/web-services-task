package jsonplaceholder.api.service.positive;

import jsonplaceholder.api.AbstractTest;
import jsonplaceholder.api.service.UserService;
import model.User;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetUserTest extends AbstractTest {

    @Test
    public void testGetResponseStatusCode() {
        given().
                when().
                get().
                then().
                log().status().
                assertThat().statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void testGetResponseHeader() {
        given().
                when().
                get().
                then().
                assertThat().header("Content-Type", equalTo("application/json; charset=utf-8"));
    }

    @Test
    public void testGetAllUsersNumber() {
        given().
                when().
                get().
                then().
                assertThat().body("size()", is(10));
    }

    @Test
    public void testGetUserById() {
        UserService userService = new UserService();
        int id = new SecureRandom().nextInt(usersNumber);
        User user = userService.getUserById(id);
        assertEquals(id, user.getId());
    }
}
