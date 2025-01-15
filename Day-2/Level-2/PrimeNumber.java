// Create PrimeNumber class to check if a given number is prime
import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is greater than 1
        if (number > 1) {
            boolean isPrime = true;

            // Loop to check divisibility by numbers from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Display the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else {
            System.out.println("Number must be greater than 1.");
        }

        // Close the Scanner object to release resources
        input.close();
    }
}
