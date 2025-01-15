import java.util.Scanner;

class LeapYearChecker {
    // Method to check if a year is a leap year
    public boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Create object and perform operation
        LeapYearChecker obj = new LeapYearChecker();
        if (obj.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
