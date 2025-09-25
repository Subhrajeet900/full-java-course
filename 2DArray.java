// addition of two matrix use of 2D array method.

public class MatrixAddition {
    public static void main(String[] args) {
        // First 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Second 3x3 matrix
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Resultant matrix
        int[][] sum = new int[3][3];

        // Adding the matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Printing the result
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// multiplication of two matrix use of 2D array
public class MatrixMultiplication {
    public static void main(String[] args) {
        // First 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Second 3x3 matrix
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Resultant matrix
        int[][] product = new int[3][3];

        // Multiplying the matrices
        for (int i = 0; i < 3; i++) {            // row of matrix1
            for (int j = 0; j < 3; j++) {        // column of matrix2
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {    // multiply row & column
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Printing the result
        System.out.println("Product of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// multiply a matrix by x number , like ( 1/2 )  

public class ScalarMultiplication {
    public static void main(String[] args) {
        // A 3x3 matrix
        int[][] matrix = {
            {2, 4, 6},
            {8, 10, 12},
            {14, 16, 18}
        };

        // Scalar value (like 1/2)
        double scalar = 0.5;  // same as 1/2

        // Resultant matrix
        double[][] result = new double[3][3];

        // Multiplying the matrix by scalar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }

        // Printing the result
        System.out.println("Matrix after multiplying by " + scalar + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
