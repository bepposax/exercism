public class PhoneNumber {
    public PhoneNumber(String number) {

        cleanedNumber = number.replaceAll("[+|(|)|\\-| |.]", "");

        if (cleanedNumber.matches("\\d*[a-zA-Z]+?\\d*"))
            throw new IllegalArgumentException("letters not permitted");
        else if (cleanedNumber.matches("\\d*\\W+?\\d*"))
            throw new IllegalArgumentException("punctuations not permitted");

        int numberLength = cleanedNumber.length();
        int codeLength;

        if (cleanedNumber.charAt(0) == '1' && numberLength == 11)
            codeLength = 1;
        else
            codeLength = 0;

        if (numberLength == 11 && codeLength == 0)
            throw new IllegalArgumentException("11 digits must start with 1");
        else if (numberLength - codeLength < 10)
            throw new IllegalArgumentException("incorrect number of digits");
        else if (numberLength - codeLength > 10)
            throw new IllegalArgumentException("more than 11 digits");

        cleanedNumber = cleanedNumber.substring(codeLength); // removes the international code

        if (cleanedNumber.charAt(0) == '0')
            throw new IllegalArgumentException("area code cannot start with zero");
        else if (cleanedNumber.charAt(0) == '1')
            throw new IllegalArgumentException("area code cannot start with one");
        else if (cleanedNumber.charAt(0 + 3) == '0')
            throw new IllegalArgumentException("exchange code cannot start with zero");
        else if (cleanedNumber.charAt(0 + 3) == '1')
            throw new IllegalArgumentException("exchange code cannot start with one");
    }

    public String getNumber() {
        return cleanedNumber;
    }

    private String cleanedNumber;
}
