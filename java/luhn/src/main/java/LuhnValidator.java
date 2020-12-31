class LuhnValidator {
    boolean isValid(String candidate) {
        candidate = candidate.replace(" ", "");

        if (candidate.length() <= 1)
            return false;

        int sum = 0;
        boolean evenStep = false;

        for (int i = candidate.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(candidate.charAt(i));

            if (evenStep)
                digit += digit > 4 ? digit - 9 : digit;

            sum += digit;
            evenStep = !evenStep;
        }
        return sum % 10 == 0;
    }
}