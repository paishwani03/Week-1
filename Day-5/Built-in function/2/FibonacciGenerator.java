import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = scanner.nextInt();

        generateFibonacci(terms);
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1, next;

        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
}
