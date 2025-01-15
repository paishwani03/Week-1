// Program to swap two numbers
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Swap numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + num1 + " and " + num2);

        // Close the Scanner object
        input.close();
    }
}
