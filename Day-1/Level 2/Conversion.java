// Program to convert weight from pounds to kilograms
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds +
                           " and in kilograms is " + weightInKilograms + ".");

        // Close the Scanner object
        input.close();
    }
}
