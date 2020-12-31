class LargestSeriesProductCalculator {
    LargestSeriesProductCalculator(String inputNumber) {
        if (inputNumber.matches("\\d*\\D+\\d*"))
            throw new IllegalArgumentException("String to search may only contain digits.");
        number = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long product = 0;
        int temp;

        if (numberOfDigits > number.length())
            throw new IllegalArgumentException(
                    "Series length must be less than or equal to the length of the string to search.");
        else if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");

        for (int i = 0; i <= number.length() - numberOfDigits; i++) {
            temp = 1;
            for (int j = 0; j < numberOfDigits; j++)
                temp *= Character.getNumericValue(number.charAt(i + j));
            if (temp > product)
                product = temp;
        }
        return product;
    }

    private String number;
}
