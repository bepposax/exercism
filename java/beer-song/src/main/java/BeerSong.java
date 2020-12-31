public class BeerSong {

    public String sing(int start, int span) {
        String song = "";

        for (int i = 0; i < span; i++) {
            song += (start == 0 ? "No more" : start) + " bottle" + (start == 1 ? "" : "s") + " of beer on the wall, "
                    + (start == 0 ? "no more" : start) + " bottle" + (start == 1 ? "" : "s") + " of beer.\n"
                    + (start == 0 ? "Go to the store and buy some more, "
                            : "Take " + (start == 1 ? "it" : "one") + " down and pass it around, ");
            start--;
            song += (start == 0 ? "no more" : start == -1 ? 99 : start) + " bottle" + (start == 1 ? "" : "s")
                    + " of beer on the wall.\n\n";
        }

        return song;
    }

    public String singSong() {
        return sing(99, 100);
    }
}