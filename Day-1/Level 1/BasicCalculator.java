import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Perform arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        // Print the results
        System.out.println("The addition, subtraction, multiplication, and division of " +
                           num1 + " and " + num2 + " are " + addition + ", " + 
                           subtraction + ", " + multiplication + ", and " + division + " respectively.");
		// Close the scanner object 
		sc.close();
    }
}
