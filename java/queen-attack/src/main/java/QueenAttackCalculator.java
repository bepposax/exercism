public class QueenAttackCalculator {
    private int q1Row, q1Col, q2Row, q2Col;

    public QueenAttackCalculator(Queen q1, Queen q2) {
        if (q1 == null || q2 == null)
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        if ((q1.getRow() == q2.getRow()) && (q1.getCol() == q2.getCol()))
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        q1Row = q1.getRow();
        q1Col = q1.getCol();
        q2Row = q2.getRow();
        q2Col = q2.getCol();
    }

    public boolean canQueensAttackOneAnother() {
        return ((q1Row == q2Row) || (q1Col == q2Col) || (Math.abs(q1Row - q2Row) == Math.abs(q1Col - q2Col)));
    }
}