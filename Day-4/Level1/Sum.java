import java.util.Scanner;

class Sum {
    // Method to calculate the sum of n natural numbers
    public int calculate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each natural number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user 
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // Create an object of the NaturalNumberSum class
       Sum obj = new Sum();

        // Calculate the sum of n natural numbers
        int sum = obj.calculate(n);

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is " + sum + ".");
    }
}
