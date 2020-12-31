import java.util.List;
import java.util.ArrayList;

public class Series {
    public Series(String s) {
        digits = s;
    }

    public List<String> slices(int n) {
        if (n > digits.length())
            throw new IllegalArgumentException("Slice size is too big.");
        if (n < 1)
            throw new IllegalArgumentException("Slice size is too small.");

        List<String> slices = new ArrayList<String>();

        for (int i = 0; i <= digits.length() - n; ++i)
            slices.add(digits.substring(i, i + n));

        return slices;
    }

    private String digits;
}