import java.util.Scanner;

class SpringSeason {
    // Method to check whether the given date falls in the Spring season
    public boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            return true; // Spring season
        }
        return false; // Not Spring season
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Create an object of the SpringSeason class
        SpringSeason seasonChecker = new SpringSeason();

        // Check if it's Spring season
        boolean isSpring = seasonChecker.isSpringSeason(month, day);

        // Display the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
