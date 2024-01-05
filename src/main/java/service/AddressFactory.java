package service;

import model.Address;

public class AddressFactory {
    public final static String TEST_STREET = "Admirala Konrada Ląkowa";
    public final static String TEST_SUITE = "Suite 666";
    public final static String TEST_CITY = "Gdańsk";
    public final static String TEST_ZIPCODE = "81-000";

    public static Address createTestAddress() {
        return new Address(TEST_STREET, TEST_SUITE, TEST_CITY, TEST_ZIPCODE);
    }
}
