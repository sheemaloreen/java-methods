# java-methods
This class provides methods for code reuse, including sorting arrays, calculating statistics on arrays, and performing matrix addition.
 
public class CodeReuse {

     * Sorts the given array of integers in ascending order using Arrays.sort.
     
     * @param array The array of integers to be sorted.
     */
    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    /**
     * Calculates the maximum value, minimum value, and average of the numbers
     * in the given array of integers.
     *
     * @param numbers The array of integers for which statistics are calculated.
     * @return An array of doubles containing the maximum value, minimum value,
       and average of the input array, in that order.
       
     * @throws IllegalArgumentException If the input array is empty or null.
     
    public static double[] calculateStats(int[] numbers) throws IllegalArgumentException {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        double[] stats = new double[3];
        
        // ... (method implementation details)

        return stats;
    }

    /**
     * Performs matrix addition on two matrices and returns the resultant matrix.
     *
     * @param matrixA The first matrix for addition.
     * @param matrixB The second matrix for addition.
     * @param rows The number of rows in the matrices.
     * @param columns The number of columns in the matrices.
     * @return The result of adding the two input matrices as a 2D array.
     * @throws IllegalArgumentException If matrix dimensions do not match.
     */
    public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB, int rows, int columns)
            throws IllegalArgumentException {
        if (matrixA.length != rows || matrixB.length != rows || matrixA[0].length != columns || matrixB[0].length != columns) {
            throw new IllegalArgumentException("Matrix dimensions do not match");
        }

        int[][] result = new int[rows][columns];
        
        // ... (method implementation details)

        return result;
    }

    /**
     * Prints the elements of the given matrix to the console.
     *
     * @param matrix The matrix to be printed.
     * @param rows The number of rows in the matrix.
     * @param columns The number of columns in the matrix.
     */
    public static void printMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * The main method shows the usage of the provided methods.
     *
    public static void main(String[] args) {
        // ... (method implementation details)
    }
}
