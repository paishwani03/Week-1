// Create MultiplesBelow100 class to find multiples of a number below 100
import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Display all multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 1; i < 100; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner object to release resources
        input.close();
    }
}
