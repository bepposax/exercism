import java.util.Map;

class Scrabble {
    private String word;
    private int score = 0;
    private Map<String, Integer> scoresMap = Map.of("aeioulnrst", 1, "dg", 2, "bcmp", 3, "fhvwy", 4, "k", 5, "jx", 8,
            "qz", 10);

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        for (int i = 0; i < word.length(); i++)
            if (Character.isLetter(word.charAt(i)))
                for (Map.Entry<String, Integer> entry : scoresMap.entrySet())
                    if (entry.getKey().contains(Character.toString(word.charAt(i)))) {
                        score += entry.getValue();
                        break;
                    }

        return score;
    }
}