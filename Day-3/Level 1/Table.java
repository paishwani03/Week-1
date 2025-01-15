import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Get a number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the results
        int[] results = new int[10];

        // Calculate the multiplication table and store it in the array
        for (int i = 0; i < 10; i++) {
            results[i] = number * (i + 1);
        }

        // Display the multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }

        // Close the Scanner object
        input.close();
    }
}
