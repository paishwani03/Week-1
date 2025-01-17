import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    // Function to add
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to subtract
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to multiply
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to divide
    public static double divide(double a, double b) {
        return a / b;
    }
}
