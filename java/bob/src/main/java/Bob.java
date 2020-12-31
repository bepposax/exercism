public class Bob {
    public String hey(String s) {
        s = s.trim();

        if (isQuestion(s))
            if (isYell(s))
                return "Calm down, I know what I'm doing!";
            else
                return "Sure.";
        else if (isYell(s))
            return "Whoa, chill out!";
        else if (!isPhrase(s))
            return "Fine. Be that way!";
        else
            return "Whatever.";
    }

    private boolean isQuestion(String s) { // if you ask him a question
        if (s.length() == 0)
            return false;
        return s.charAt(s.length() - 1) == '?';
    }

    private boolean isYell(String s) { // if you yell at him
        if (isPhrase(s)) {
            boolean hasLetters = false;

            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i))) {
                    hasLetters = true;
                    if (Character.isLowerCase(s.charAt(i)))
                        return false;
                }
            }
            return hasLetters;
        }
        return false;
    }

    private boolean isPhrase(String s) { // if you address him without saying anything
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                return true;
        return false;
    }
}
