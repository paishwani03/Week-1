// Create FizzBuzzFor class to print FizzBuzz for numbers up to user input
import java.util.Scanner;

class FizzBuzzFor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Loop through numbers from 1 to the user input
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Close the Scanner object to release resources
        input.close();
    }
}
