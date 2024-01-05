package service;

import model.User;
import util.RandomDataGenerator;

import static service.AddressFactory.createTestAddress;
import static service.CompanyFactory.createTestCompanyWithAllData;

public class UserFactory {

    public final static int MAX_USER_NAME_LENGTH = 30;
    public final static int MIN_USER_USERNAME_LENGTH = 8;
    public final static int MAX_USER_USERNAME_LENGTH = 15;

    public static User createNewRandomUser() {
        String name = RandomDataGenerator.generateAlphaNumericRandomString(MIN_USER_USERNAME_LENGTH,
                MAX_USER_USERNAME_LENGTH);
        String username =
                RandomDataGenerator.generateAlphaNumericRandomString(MIN_USER_USERNAME_LENGTH,
                        MAX_USER_USERNAME_LENGTH);
        String email = RandomDataGenerator.generateRandomEmail();
        return new User(name, username, email);
    }

    public static User createNewRandomUserWithAllData() {
        createNewRandomUser();
        User user = createNewRandomUser();
        user.setAddress(createTestAddress());
        user.setPhone("(999) 999-999-999");
        user.setWebsite("website.test");
        user.setCompany(createTestCompanyWithAllData());
        return user;
    }
}
