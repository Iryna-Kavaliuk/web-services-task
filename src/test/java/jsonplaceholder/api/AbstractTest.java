package jsonplaceholder.api;

import io.restassured.RestAssured;
import jsonplaceholder.api.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractTest {
  
  public static int usersNumber;

  @BeforeEach
  public void initialiseURL() {
    RestAssured.baseURI = TestConfiguration.baseEndpoint;
    RestAssured.basePath = TestConfiguration.baseUserPath;
  }

  @BeforeAll
  public static void initialiseUsersNumber() {
    UserService userService = new UserService();
    usersNumber = userService.getUsersNumber();
  }

}
