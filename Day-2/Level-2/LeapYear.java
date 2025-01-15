// Create LeapYear class to determine if a given year is a leap year
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check if the year is a valid Gregorian calendar year
        if (year >= 1582) {
            // Determine if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Invalid year! Enter a year >= 1582.");
        }

        // Close the Scanner object to release resources
        input.close();
    }
}
