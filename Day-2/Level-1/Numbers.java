// Create OddEvenNumbers class to print odd and even numbers between 1 and the entered number
import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Odd numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.println(i); // Print odd numbers
                }
            }

            System.out.println("Even numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i); // Print even numbers
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        // Close the Scanner stream
        input.close();
    }
}
