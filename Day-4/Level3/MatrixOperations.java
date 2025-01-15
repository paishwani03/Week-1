import java.util.Random;
import java.util.Scanner;

class MatrixOperations {

    // Generate a random matrix with given rows and columns
    public int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Add two matrices
    public int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Subtract two matrices
    public int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Multiply two matrices
    public int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Find the transpose of a matrix
    public int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Find the determinant of a 2x2 matrix
    public int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Find the determinant of a 3x3 matrix
    public int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Find the inverse of a 2x2 matrix
    public double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            return null; // No inverse if determinant is zero
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;

        return inverse;
    }

    // Find the inverse of a 3x3 matrix
    public double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            return null; // No inverse if determinant is zero
        }

        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) determinant;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) determinant;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) determinant;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) determinant;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) determinant;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) determinant;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) determinant;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) determinant;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) determinant;

        return inverse;
    }

    // Display a matrix
    public void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an instance of MatrixOperations class
        MatrixOperations matrixOps = new MatrixOperations();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns for the matrices: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        // Generate random matrices
        int[][] matrixA = matrixOps.generateMatrix(rows, cols);
        int[][] matrixB = matrixOps.generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        matrixOps.displayMatrix(matrixA);
        System.out.println("Matrix B:");
        matrixOps.displayMatrix(matrixB);

        // Perform matrix operations
        int[][] sum = matrixOps.addMatrices(matrixA, matrixB);
        System.out.println("Matrix A + B:");
        matrixOps.displayMatrix(sum);

        int[][] difference = matrixOps.subtractMatrices(matrixA, matrixB);
        System.out.println("Matrix A - B:");
        matrixOps.displayMatrix(difference);

        if (cols == rows) {
            int[][] product = matrixOps.multiplyMatrices(matrixA, matrixB);
            System.out.println("Matrix A * B:");
            matrixOps.displayMatrix(product);
        }

        int[][] transpose = matrixOps.transposeMatrix(matrixA);
        System.out.println("Transpose of Matrix A:");
        matrixOps.displayMatrix(transpose);
        
        if (rows == 2 && cols == 2) {
            double[][] inverse = matrixOps.inverse2x2(matrixA);
            if (inverse != null) {
                System.out.println("Inverse of Matrix A:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(inverse[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Matrix A has no inverse.");
            }
        }

        if (rows == 3 && cols == 3) {
            double[][] inverse = matrixOps.inverse3x3(matrixA);
            if (inverse != null) {
                System.out.println("Inverse of Matrix A:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(inverse[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Matrix A has no inverse.");
            }
        }
    }
}
