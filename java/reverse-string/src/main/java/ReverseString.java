class ReverseString {

    String reverse(String inputString) {
        String outputString = "";

        for (int i = inputString.length() - 1; i >= 0; i--)
            outputString += inputString.substring(i, i + 1);

        return outputString;
    }

}
