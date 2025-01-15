// Create YoungestAndTallest class to find the youngest and tallest among three friends
import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter ages of three friends
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();

        // Prompt the user to enter heights of three friends
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = input.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = input.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = input.nextInt();

        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest;
        if (youngestAge == ageAmar) {
            youngest = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Find the tallest friend
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest;
        if (tallestHeight == heightAmar) {
            tallest = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // Close the Scanner object to release resources
        input.close();
    }
}
