import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square > 64 || square < 1)
            throw new IllegalArgumentException("square must be between 1 and 64");

        if (square <= 2)
            return new BigInteger(Integer.toString(square));
        else
            return BigInteger.TWO.multiply(grainsOnSquare(square - 1));
    }

    BigInteger grainsOnBoard() {
        return BigInteger.TWO.multiply(grainsOnSquare(64)).subtract(BigInteger.ONE);
    }

}
