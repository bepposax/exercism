class IsogramChecker {

    boolean isIsogram(String phrase) {
        String lowerPhrase = phrase.toLowerCase();

        for (int i = 1; i < phrase.length(); i++)
            if (Character.isLetter(phrase.charAt(i)))
                for (int j = 0; j < i; j++)
                    if (Character.isLetter(phrase.charAt(j)))
                        if (lowerPhrase.charAt(i) == lowerPhrase.charAt(j))
                            return false;
        return true;
    }

    public static void main(String[] args){
        IsogramChecker iso = new IsogramChecker();

        System.out.println(iso.isIsogram("Ciao"));
    }
}
