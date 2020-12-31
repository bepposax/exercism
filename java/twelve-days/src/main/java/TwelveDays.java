class TwelveDays {
    String verse(int verseNumber) {

        String[] cardinal = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
                "tenth", "eleventh", "twelfth" };
        String verse = "On the " + cardinal[verseNumber - 1] + " day of Christmas my true love gave to me: ";

        switch (verseNumber) { // this has no breaks so it executes all remaining cases and completes the verse
            case (12):
                verse += "twelve Drummers Drumming, ";
            case (11):
                verse += "eleven Pipers Piping, ";
            case (10):
                verse += "ten Lords-a-Leaping, ";
            case (9):
                verse += "nine Ladies Dancing, ";
            case (8):
                verse += "eight Maids-a-Milking, ";
            case (7):
                verse += "seven Swans-a-Swimming, ";
            case (6):
                verse += "six Geese-a-Laying, ";
            case (5):
                verse += "five Gold Rings, ";
            case (4):
                verse += "four Calling Birds, ";
            case (3):
                verse += "three French Hens, ";
            case (2):
                verse += "two Turtle Doves, and ";
            case (1):
                verse += "a Partridge in a Pear Tree.\n";
        }
        return verse;
    }

    String verses(int startVerse, int endVerse) {
        String song = "";
        while (startVerse <= endVerse) {
            song += verse(startVerse) + (startVerse < endVerse ? "\n" : ""); // last verse has no extra new line in the
                                                                             // test string
            startVerse++;
        }
        return song;
    }

    String sing() {
        return verses(1, 12);
    }
}
