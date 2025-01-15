import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize a maximum factor size
        int maxFactor = 10;
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Index to track the position in the factors array

        // Loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the number is divisible, store it as a factor
                if (index == maxFactor) {
                    // If the array is full, increase its size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor]; // Temporary array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign temp back to factors
                }
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the Scanner object
        input.close();
    }
}
