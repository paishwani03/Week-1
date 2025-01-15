import java.util.Scanner;

class FactorsCalculator {
    // Method to find the factors of a number and store them in an array
    public int[] findFactors(int number) {
        int count = 0;
        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        // Store factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors
    public int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create object and perform operations
        FactorsCalculator obj = new FactorsCalculator();
        int[] factors = obj.findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display results
        System.out.println("Sum of Factors: " + obj.sumOfFactors(factors));
        System.out.println("Product of Factors: " + obj.productOfFactors(factors));
        System.out.println("Sum of Squares of Factors: " + obj.sumOfSquares(factors));
    }
}
