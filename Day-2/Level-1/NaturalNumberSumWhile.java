// Create NaturalNumberSumWhile class to find the sum of n natural numbers using a while loop
import java.util.Scanner;

class NaturalNumberSumWhile {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Compute sum using the while loop
            int sum = 0;
            int i = 1;
            while (i <= number) {
                sum += i; // Add i to sum
                i++; // Increment i
            }

            // Compare with formulae result
            int formulaSum = number * (number + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Is the result correct? " + (sum == formulaSum));
        } else {
            System.out.println(number + " is not a natural number.");
        }

        // Close the Scanner stream
        input.close();
    }
}
