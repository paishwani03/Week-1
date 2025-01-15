import java.util.Scanner;

class CheckNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Define an integer array of 5 elements
        int[] numbers = new int[5];

        // Get user input for the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        // Check each number and display whether it is positive, negative, or zero
        // Also check for even/odd if the number is positive
        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is positive and ");
                System.out.println((num % 2 == 0) ? "even." : "odd.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last element.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }

        // Close the Scanner object
        input.close();
    }
}
