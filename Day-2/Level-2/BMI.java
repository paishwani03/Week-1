// Create BMI class to calculate BMI and determine weight status
import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in kg
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in cm
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightMeters * heightMeters);

        // Determine weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the BMI and weight status
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Weight Status: " + status);

        // Close the Scanner object to release resources
        input.close();
    }
}
