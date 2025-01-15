// Create CountdownForLoop class to countdown from the user's input to 1 using a for loop
import java.util.Scanner;

class CountdownForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the countdown start number from the user
        System.out.print("Enter a number for countdown: ");
        int counter = input.nextInt();

        // Run a for loop to countdown from the entered number to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Close the Scanner stream
        input.close();
    }
}
