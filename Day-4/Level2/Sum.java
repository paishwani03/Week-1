import java.util.Scanner;

class Sum {
    // Method to calculate the sum using recursion
    public int sumUsingRecursion(int n) {
        if (n == 1) return 1;
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate the sum using formula
    public int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            return;
        }

        // Create object and perform operations
        Sum obj = new Sum();
        int recursiveSum = obj.sumUsingRecursion(n);
        int formulaSum = obj.sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results are " + (recursiveSum == formulaSum ? "equal" : "not equal") );
    }
}
