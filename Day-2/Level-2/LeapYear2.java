// Create LeapYear class to check if a year is a leap year using a single if condition
import java.util.Scanner;

class LeapYear2 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get year input from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Determine if the year is a leap year using a single if condition
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the Scanner stream
        input.close();
    }
}
