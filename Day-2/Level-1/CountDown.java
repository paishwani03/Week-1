// Create Countdown class to countdown from the user's input to 1 using a while loop
import java.util.Scanner;

class Countdown {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the countdown start number from the user
        System.out.print("Enter a number for countdown: ");
        int counter = input.nextInt();

        // Run a while loop to countdown from the entered number to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

        // Close the Scanner stream
        input.close();
    }
}
