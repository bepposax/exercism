import java.util.Map;
import java.util.LinkedHashMap;

public class RomanNumeral {
    public RomanNumeral(int inputNumber) {
        decimalNumber = inputNumber;
    }

    public String getRomanNumeral() {
        String romanNumeral = "";
        Map<Integer, String> conversionMap = new LinkedHashMap<Integer, String>();

        conversionMap.put(1000, "M");
        conversionMap.put(900, "CM");
        conversionMap.put(500, "D");
        conversionMap.put(400, "CD");
        conversionMap.put(100, "C");
        conversionMap.put(90, "XC");
        conversionMap.put(50, "L");
        conversionMap.put(40, "XL");
        conversionMap.put(10, "X");
        conversionMap.put(9, "IX");
        conversionMap.put(5, "V");
        conversionMap.put(4, "IV");
        conversionMap.put(1, "I");

        for (int conversionKey : conversionMap.keySet()) {
            while (decimalNumber >= conversionKey) {
                romanNumeral += conversionMap.get(conversionKey);
                decimalNumber -= conversionKey;
            }
        }

        return romanNumeral;
    }

    private int decimalNumber;
}