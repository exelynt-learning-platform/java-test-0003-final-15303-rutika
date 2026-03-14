public class BinaryTrianglePattern {

    private static final int TOTAL_ROWS = 6;

    public static void main(String[] args) {
        printBinaryTriangle(TOTAL_ROWS);
    }

    /**
     * Prints a binary triangle pattern with alternating 0s and 1s.
     *
     * @param rows number of rows in the triangle
     */
    public static void printBinaryTriangle(int rows) {

        for (int row = 1; row <= rows; row++) {

            int currentValue = getStartingValue(row);

            for (int column = 1; column <= row; column++) {
                System.out.print(currentValue + " ");
                currentValue = toggleBinaryValue(currentValue);
            }

            System.out.println();
        }
    }

    /**
     * Determines the starting value for each row.
     * Odd rows start with 1, even rows start with 0.
     */
    private static int getStartingValue(int row) {
        return (row % 2 == 1) ? 1 : 0;
    }

    /**
     * Toggles binary value between 0 and 1.
     */
    private static int toggleBinaryValue(int value) {
        return (value == 1) ? 0 : 1;
    }
}
