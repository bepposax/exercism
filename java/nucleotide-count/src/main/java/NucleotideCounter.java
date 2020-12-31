import java.util.Map;
import java.util.HashMap;

public class NucleotideCounter {
    public NucleotideCounter(String s) {
        if (s.matches("[A|C|G|T]*[^A|^C|^G|^T]+[A|C|G|T]*"))
            throw new IllegalArgumentException();

        strand = s;
        nucleotids.putAll(Map.of('A', 0, 'C', 0, 'G', 0, 'T', 0));
    }

    public Map<Character, Integer> nucleotideCounts() {
        char X;

        for (int i = 0; i < strand.length(); i++) {
            X = strand.charAt(i);
            nucleotids.replace(X, nucleotids.get(X) + 1);
        }
        return nucleotids;
    }

    private String strand;
    private HashMap<Character, Integer> nucleotids = new HashMap<>();
}