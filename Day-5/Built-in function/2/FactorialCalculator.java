import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        System.out.println("Factorial of " + number + " is: " + calculateFactorial(number));
    }

    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}
