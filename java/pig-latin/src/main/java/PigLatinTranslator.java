public class PigLatinTranslator {

    public PigLatinTranslator() {
    }

    public String translate(String word) {

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        String[] vowel_sounds = { "xr", "yt" };

        // RULE 1
        for (char vowel : vowels)
            if (word.charAt(0) == vowel) {
                word += "ay";
                return word;
            }

        for (String vowel_sound : vowel_sounds)
            if (word.length() > 2 && word.substring(0, 2).equals(vowel_sound)) {
                word += "ay";
                return word;
            }

        // the word starts with a consonant
        // RULE 3
        if (word.length() > 2 && word.substring(1, 3).equals("qu")) {
            word = word.substring(3) + word.substring(0, 3) + "ay";
            return word;
        }

        // RULE 2
        else {
            int i = 1; // checks consonant cluster from the second letter
            boolean flag;

            do {
                flag = false;

                for (char vowel : vowels) {
                    System.out.println(word.charAt(i) + " != " + vowel + "\tflag: " + flag);
                    if (word.charAt(i) == vowel || word.charAt(i) == 'y') {
                        flag = true;
                        System.out.println(flag);
                        break;
                    }
                }
                if (flag == false)
                    i++;
            } while (i < word.length() && flag == false);

            word = word.substring(i) + word.substring(0, i) + "ay";
            return word;

        }
    }
}