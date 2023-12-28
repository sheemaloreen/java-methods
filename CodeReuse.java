import java.util.Arrays;

public class CodeReuse {
    // sorting method

    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }


    // calculate Stats method
    public static double[] calculateStats(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        double[] stats = new double[3];
        
        // Initializing max and min with the first element of the array
        double max = numbers[0];
        double min = numbers[0];
        double sum = numbers[0];

      
        for (int i = 1; i < numbers.length; i++) {
           
            if (numbers[i] > max) {
                max = numbers[i];
            }
           
            if (numbers[i] < min) {
                min = numbers[i];
            }
          
            sum += numbers[i];
        }

        // Calculate average
        double average = sum / numbers.length;

        // Set values in the result array
        stats[0] = max;
        stats[1] = min;
        stats[2] = average;

        return stats;

    }
    // matrix addition method
        public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB, int rows, int columns) {
            if (matrixA.length != rows || matrixB.length != rows || matrixA[0].length != columns || matrixB[0].length != columns) {
                throw new IllegalArgumentException("Matrix dimensions do not match");
            }
    
            int[][] result = new int[rows][columns];
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
    
            return result;
        }
    
        public static void printMatrix(int[][] matrix, int rows, int columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        //calling sorting method

        int[] Array1 = {5, 20, 8, 60, 7};
        System.out.println("Original Array: " + Arrays.toString(Array1));

        
        sortAscending(Array1);
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(Array1));
        
        //calling stats method

        int[] myArray = {5, 2, 8, 1, 7};

        double[] result = calculateStats(myArray);

        System.out.println("Maximum Value: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
        System.out.println("Average: " + result[2]);
    

        // calling matrix addition method
            int rows = 3;
            int columns = 3;
    
            int[][] matrixA = {
                {1, 2, 1},
                {1, 5, 6},
                {3, 8, 9}
            };
    
            int[][] matrixB = {
                {2, 0, 6},
                {6, 7, 2},
                {3, 5, 0}
            };
    
            
            int[][] resultMatrix = matrixAddition(matrixA, matrixB, rows, columns);
    

            System.out.println("Matrix A:");
            printMatrix(matrixA, rows, columns);
    
            System.out.println("Matrix B:");
            printMatrix(matrixB, rows, columns);
    
            System.out.println("Result Matrix (Sum of A and B):");
            printMatrix(resultMatrix, rows, columns);
        }
    }
    