// Create FizzBuzz class to print Fizz, Buzz, and FizzBuzz based on number divisibility
import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize the counter to start from 1
        int i = 1;

        // Use while loop to print numbers from 1 to the input number
        while (i <= number) {
            // Check if the current number is divisible by both 3 and 5 (FizzBuzz)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the current number is divisible by 3 (Fizz)
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the current number is divisible by 5 (Buzz)
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
            
            // Increment the counter
            i++;
        }

        // Close the Scanner object to release resources
        input.close();
    }
}
