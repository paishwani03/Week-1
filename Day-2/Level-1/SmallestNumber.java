// Create SmallestNumber class to check if the first number is smallest
import java.util.Scanner;

class SmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("The first number " + number1 + " is the smallest.");
        } else {
            System.out.println("The first number " + number1 + " is not the smallest.");
        }

        // Close the Scanner stream
        input.close();
    }
}
