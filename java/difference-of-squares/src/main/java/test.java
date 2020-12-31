public class test {

    static int computeSumOfSquaresTo(int input) {
        int sum = 1;
        for (int i = 1; i < input; i++) {

            sum += i * (i + 2) + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(
                "(2)\t" + computeSumOfSquaresTo(2) + "\t" + "expected: 5\n" + "(5)\t" + computeSumOfSquaresTo(5) + "\t"
                        + "expected: 55\n" + "(100)\t" + computeSumOfSquaresTo(100) + "\t" + "expected: 338350");
    }
}