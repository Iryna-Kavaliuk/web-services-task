package service;

import model.Company;

public class CompanyFactory {

    public final static String TEST_COMPANY_NAME = "EPAM Systems";
    public final static String TEST_CATCHPHRASE = "test catchPhrase";
    public final static String TEST_BS = "test bs";

    public static Company createTestCompanyWithAllData() {
        return new Company(TEST_COMPANY_NAME, TEST_CATCHPHRASE, TEST_BS);
    }

    public static Company createTestCompany() {
        return new Company(TEST_COMPANY_NAME);
    }
}
