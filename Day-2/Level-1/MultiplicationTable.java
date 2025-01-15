// Create MultiplicationTable class to print the multiplication table of a number from 6 to 9
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the Scanner stream
        input.close();
    }
}
