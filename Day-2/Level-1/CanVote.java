// Create CanVote class to check if the person can vote
import java.util.Scanner;

class CanVote {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get age input from the user
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Check if age is greater or equal to 18
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner stream
        input.close();
    }
}
