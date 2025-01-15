import java.util.Scanner;

class QuotientRemainder {
    // Method to find the quotient and remainder
    public int[] findQuotientAndRemainder(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder}; // Return both values as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the number and divisor
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Create an object of the QuotientRemainder class
        QuotientRemainder obj = new QuotientRemainder();

        // Find the quotient and remainder
        int[] result = obj.findQuotientAndRemainder(number, divisor);

        // Display the result
        System.out.println("The quotient is " + result[0] + " and the remainder is " + result[1] + ".");
    }
}
