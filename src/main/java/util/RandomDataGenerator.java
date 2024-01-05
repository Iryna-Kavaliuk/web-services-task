package util;

import java.security.SecureRandom;

public class RandomDataGenerator {

    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String ALLOWED_SPECIAL_CHARACTERS = "!@#$%^&*()_{}[]:\";'<>?,./'";
    static final String NON_UTF_CHARACTERS = "•¡¤¦§¨©ª«¬®¯±²³¶¹º»¼½¾¿‡•…‰‹›⁰€™■･�टीकताोु।確認のため、電子";
    static final String DIGITS = "0123456789";

    static SecureRandom random = new SecureRandom();

    public static String generateAlphaNumericRandomString(int minLength, int maxLenght) {
        String allowedSymbols = ALPHABET + DIGITS;
        return generateString(allowedSymbols, minLength, maxLenght);
    }

//    public static String generateRandomStringWithSpecialAndNonUTFSymbols(int maxLenght) {
//        String allowedSymbols = ALLOWED_SPECIAL_CHARACTERS + NON_UTF_CHARACTERS;
//        return generateString(allowedSymbols, minLength, maxLenght);
//    }

    public static String generateRandomEmail() {
        String allowedSymbols = ALPHABET + DIGITS + "_";
        return generateString(allowedSymbols, 5, 20) + "@test.com";
    }

    private static String generateString(String allowed, int minLength, int maxLength) {
        final int length = random.nextInt(minLength, maxLength);
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(allowed.charAt(random.nextInt(allowed.length())));
        return sb.toString();
    }
}
