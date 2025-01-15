// Create SpringSeason class to check if it's spring season
import java.util.Scanner;

class SeasonCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get month and day input
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        // Check if the date falls in spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the Scanner stream
        input.close();
    }
}
