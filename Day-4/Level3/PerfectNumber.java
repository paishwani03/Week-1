import java.util.Scanner;

public class PerfectNumber {

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object named input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
    }
}
