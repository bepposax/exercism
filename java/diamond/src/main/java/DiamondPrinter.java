import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    private String line = "";
    private List<String> diamond = new ArrayList<>();
    private final String ALPH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int charIndex;
    private int dmndSize;

    List<String> printToList(char a) {
        charIndex = ALPH.indexOf(Character.toString(a));
        dmndSize = charIndex * 2 + 1;

        for (int i = 0; i < charIndex; i++)
            addLine(i);
        for (int i = charIndex; i >= 0; i--)
            addLine(i);

        return diamond;
    }

    public void addLine(int i) {
        for (int j = 0; j < dmndSize; j++)
            line += (j == charIndex - i || j == charIndex + i ? ALPH.charAt(i) : " ");

        diamond.add(line);
        line = "";
    }
}