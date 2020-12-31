public class Queen {
    private int row, col;

    public Queen(int r, int c) {
        if (r < 0 || c < 0)
            throw new IllegalArgumentException("Queen position must have positive " + (r < 0 ? "row." : "column."));
        if (r > 7 || c > 7)
            throw new IllegalArgumentException("Queen position must have " + (r > 7 ? "row " : "column ") + "<= 7.");
        this.row = r;
        this.col = c;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}