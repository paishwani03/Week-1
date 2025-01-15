// Create DayOfWeek class to calculate the day of the week for a given date
import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the month, day, and year as input
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = input.nextInt();
        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Perform the calculations using the formulae to find the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the day of the week
        System.out.println("Day of the week: " + d0);

        // Close the Scanner stream
        input.close();
    }
}
