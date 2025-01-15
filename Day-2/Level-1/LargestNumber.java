// Create LargestNumber class to check which number is largest
import java.util.Scanner;

class LargestNumber {
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

        // Check which number is largest
        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));

        // Close the Scanner stream
        input.close();
    }
}
