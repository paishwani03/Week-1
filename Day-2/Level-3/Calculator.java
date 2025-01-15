// Create Calculator class using switch case to perform basic operations
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the two numbers and operator input from the user
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        // Perform operations based on the operator using switch...case
        double result = 0;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);

        // Close the Scanner stream
        input.close();
    }
}
