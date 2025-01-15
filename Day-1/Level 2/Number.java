// Program to calculate quotient and remainder
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Print the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                           " of two numbers " + num1 + " and " + num2);

        // Close the Scanner object
        input.close();
    }
}
