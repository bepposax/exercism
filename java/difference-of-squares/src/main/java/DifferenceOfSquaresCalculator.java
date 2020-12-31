import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow(((input + 1) * input / 2), 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        while (input > 0)
            sum += (int) Math.pow(input--, 2);
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}