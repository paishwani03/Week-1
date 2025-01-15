import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            System.exit(0);
			}

        // Declare arrays to store odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0; // Index trackers for odd and even arrays

        // Separate numbers into odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Store even number
            } else {
                oddNumbers[oddIndex++] = i; // Store odd number
            }
        }

        // Display odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Display even numbers
        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Close the Scanner object
        input.close();
    }
}
