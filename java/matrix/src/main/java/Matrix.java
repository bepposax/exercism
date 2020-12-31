
class Matrix {
    private int[][] matrix;
    private int numRows, numCols;

    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\n");
        numRows = rows.length;
        numCols = rows[0].split(" ").length;
        matrix = new int[numRows][numCols];
        int i = 0, j;

        for (String row : rows) {
            j = 0;
            for (String element : row.split(" "))
                matrix[i][j++] = Integer.parseInt(element);
            i++;
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[numRows];

        for (int i = 0; i < numRows; i++)
            col[i] = matrix[i][columnNumber - 1];

        return col;
    }
}
