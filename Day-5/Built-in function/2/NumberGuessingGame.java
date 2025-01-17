import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100, guess;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100. I'll try to guess it!");

        while (!correct) {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'high' if my guess is too high, 'low' if it's too low, or 'correct' if I guessed it:");
            String feedback = scanner.nextLine();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                correct = true;
                System.out.println("Yay! I guessed your number!");
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
    }

    // Function to generate a guess
    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2; // Use binary search approach for efficiency
    }
}
