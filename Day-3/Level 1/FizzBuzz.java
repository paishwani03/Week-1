import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create an array to store the FizzBuzz results
        String[] fizzBuzzArray = new String[number];

        // Loop through the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i - 1] = "FizzBuzz"; // If divisible by both 3 and 5
            } else if (i % 3 == 0) {
                fizzBuzzArray[i - 1] = "Fizz"; // If divisible by 3
            } else if (i % 5 == 0) {
                fizzBuzzArray[i - 1] = "Buzz"; // If divisible by 5
            } else {
                fizzBuzzArray[i - 1] = String.valueOf(i); // Otherwise, print the number
            }
        }

        // Display the FizzBuzz results
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzzArray[i]);
        }

        // Close the Scanner object
        input.close();
    }
}
