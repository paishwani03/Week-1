import java.util.Scanner;

public class CalendarGenerator {

    // Array to store the names of the months
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to calculate the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = MONTH_NAMES[month - 1];
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.printf("%n    %s %d%n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Display days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0) { // Move to next line after Saturday
                System.out.println();
            }
        }
        System.out.println(); // Move to next line after printing the calendar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month and year from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate the input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input. Please enter a valid month (1-12) and year (>0).");
        } else {
            // Display the calendar
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
