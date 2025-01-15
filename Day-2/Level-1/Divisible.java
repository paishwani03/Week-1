// Create DivisibleBy5 class to check divisibility by 5
import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("The number " + number + " is divisible by 5.");
        } else {
            System.out.println("The number " + number + " is not divisible by 5.");
        }

        // Close the Scanner stream
        input.close();
    }
}
