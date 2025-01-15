import java.util.Scanner;

class Copy2DTo1D {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the matrix
        System.out.print("Enter number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter number of columns: ");
        int c = input.nextInt();

        // Create a 2D array (matrix) based on user input
        int[][] matrix = new int[r][c];

        // Get the elements of the matrix from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array to store the matrix elements
        int[] arr = new int[r * c];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("1D Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the Scanner object
        input.close();
    }
}
