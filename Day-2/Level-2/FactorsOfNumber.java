// Create FactorsOfNumber class to find all factors of a number
import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Display all factors of the number
        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner object to release resources
        input.close();
    }
}
