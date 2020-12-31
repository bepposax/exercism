class IsbnVerifier {
    boolean isValid(String stringToVerify) {
        if (stringToVerify.matches("\\d{1}-?\\d{3}-?\\d{5}-?(\\d|X){1}")) {
            stringToVerify = stringToVerify.replace("-", "");

            int result = 0;

            for (int i = 0; i < stringToVerify.length() - 1; i++) {
                result += Character.getNumericValue(stringToVerify.charAt(i)) * (10 - i);
            }
            result += stringToVerify.charAt(9) == 'X' ? 10 : Character.getNumericValue(stringToVerify.charAt(9));

            return result % 11 == 0;

        } else
            return false;
    }
}
