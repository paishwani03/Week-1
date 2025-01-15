import java.util.Scanner;

class TableRange.java {
    public static void main(String args[]) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number between 6 and 9
        System.out.println("Enter a number between 6 and 9");
        
        // Read the integer input from the user
        int n = sc.nextInt();
        
        // Create an array to store the results of the multiplication table (size 10 for 1 to 10)
        int result[] = new int[10];

        // Check if the input is between 6 and 9 (inclusive)
        if (n >= 6 && n <= 9) {
            
            // Loop to generate the multiplication table and store the results in the array
            for (int j = 0; j < 10; j++) {
                // Multiply n by (j+1) to generate the table from 1 to 10
                result[j] = n * (j + 1);
            }

            // Loop to print the multiplication table
            for (int j = 0; j < 10; j++) {
                // Print the multiplication result in the format: n * j+1 = result[j]
                System.out.println(n + " * " + (j + 1) + " = " + result[j]);
            }
            
        } else {
            // If the input is not between 6 and 9, print an invalid message
            System.out.println("Invalid input. Please enter a number between 6 and 9.");
        }
    }
}
